package org.example.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtendReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getReportInstance(){
        if(extent == null){
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String reportPath = "reports/ExtentReports/" + timeStamp + ".html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

             spark.config().setDocumentTitle("Automation Test Report");
             spark.config().setReportName("Test Execution Report");

             extent = new ExtentReports();
             extent.attachReporter(spark);

        }
        return extent;
    }

    public static ExtentTest createTest(String testName){
            test = getReportInstance().createTest(testName);
        return test;
    }
    public static String captureScreenshot(WebDriver driver, String screenshotName){
        try {
            File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String path = System.getProperty("user.dir")+".screenshort/"+screenshotName+".png";
            System.out.println("path: "+path);
           FileUtils.copyFile(src,new File(path));
            return path;

        }
        catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }

}
