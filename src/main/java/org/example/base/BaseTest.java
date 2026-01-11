package org.example.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.example.utils.EmailUtils;
import org.example.utils.ExtendReportManager;
import org.example.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite //once run before the teste and once run after test
    public void setupReport(){
        extent = ExtendReportManager.getReportInstance();

    }
    @AfterSuite //once run before the teste and once run after test
    public void teardownReport(){
        extent.flush();
        String reportPath = ExtendReportManager.reportPath;
        EmailUtils.sendTestReport(reportPath);

    }

    @BeforeMethod
    public void setUp() {

        Log.info("Starting test");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Log.info("Heated in the link");
        driver.get("https://admin-demo.nopcommerce.com/login");
    }
    @AfterMethod

    public void tearDown(ITestResult testResult) {
        //screen short
        if (testResult.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = ExtendReportManager.captureScreenshot(driver,"LoginScreen");
            test.fail("Test failed",
                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        }

        if (driver != null) {
            log.info("Stopping testing");
            driver.quit();
        }
    }
}
