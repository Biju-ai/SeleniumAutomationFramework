package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DataProviderClass {
    protected WebDriver driver;

    public DataProviderClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement Login;


    public void login(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        Login.click();
        Assert.assertTrue(true);
    }

}
