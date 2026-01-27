package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadingMultipleFiles {
    protected WebDriver driver;
    @Test
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
    }
}
