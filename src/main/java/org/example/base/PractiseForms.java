package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PractiseForms {
    protected WebDriver Driver;

    @BeforeMethod
    public void setup(){
        Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://demoqa.com/automation-practice-form");

    }
    @AfterMethod
    public void teardown(){
        if (Driver != null){
            Driver.quit();
        }
    }
}
