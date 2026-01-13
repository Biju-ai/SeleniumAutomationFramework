package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingDelo {

    protected WebDriver driver;

    public WindowHandlingDelo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div")
    WebElement dropDown;

    @FindBy(xpath = " //div[contains(@class,'element-list collapse show')]//li[@id='item-0']")
    WebElement browserWindows;

    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement tabButton;


    public void getDeopDown() throws InterruptedException {
        dropDown.click();
        Thread.sleep(5000);

    }

    public void clickBrowserWindows() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(browserWindows))
                .click();
                Thread.sleep(5000);
    }


    public void clickNewTab() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(1000))
                .until(ExpectedConditions.elementToBeClickable(tabButton))
                .click();
                Thread.sleep(5000);

    }



}
