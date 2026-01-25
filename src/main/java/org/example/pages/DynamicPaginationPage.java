package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPaginationPage {
    protected WebDriver driver;
    public DynamicPaginationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='input-username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;


    public void getUsername(String username1){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(username));
        username.clear();

        username.sendKeys(username1);
    }
    public void getPassword(String password1){
        password.clear();
        password.sendKeys(password1);
    }
}
