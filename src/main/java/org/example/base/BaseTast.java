package org.example.base;

import org.example.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTast {
    private static final Logger log = LoggerFactory.getLogger(BaseTast.class);
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        Log.info("Starting test");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Log.info("Heated in the link");
        driver.get("https://admin-demo.nopcommerce.com/login");

    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            log.info("Stopping testing");
            driver.quit();
        }
    }
}
