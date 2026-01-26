package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavascriptExecuterClass {
    protected WebDriver driver;
    public JavascriptExecuterClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//input[@id='name'])[1]")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='female']")
    WebElement femaleButton;

    public void getFirstName() {
        //passing the text into the text field instead of sendKeys
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','biju shrestha')",firstName);
    }


    //clicking the button using JavaScript instead of click
    public void getFemaleButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",femaleButton);

    }

}
