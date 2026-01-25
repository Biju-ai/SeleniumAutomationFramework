package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HandlingDatePicker {
    protected WebDriver driver;
  @BeforeMethod
    public  void main() {

      driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
//
//        driver.switchTo().frame(0);
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/01/2022");

    }
}
