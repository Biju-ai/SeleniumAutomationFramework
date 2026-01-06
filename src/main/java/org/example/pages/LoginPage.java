package org.example.pages;

import org.example.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By email = By.id("Email");
    private By password = By.id("Password");
    private By submit = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterEmail(String Email) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(Email);

    }
    public void enterPassword(String Password) {
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(Password);

    }
    public void clickSubmit() {
        Log.info("Clicking submit");
        driver.findElement(submit).click();
    }

}
