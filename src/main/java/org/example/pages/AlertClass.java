package org.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertClass {
    protected WebDriver driver;

    public AlertClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    Alert alert1 = driver.switchTo().alert();


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div")
    WebElement dropDown;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-1']")
    WebElement alert;

    @FindBy(xpath = "//button[@id='alertButton']")
    WebElement AlertButton;

    @FindBy(xpath = "//button[@id='confirmButton']")
    WebElement ConfirmButton;

    @FindBy(xpath = "//button[@id='promtButton']")
    WebElement PromtButton;

    public void getDropDown() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(dropDown))
                .click();

    }

    public void clickAlert() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(alert))
                .click();
        Thread.sleep(5000);
    }

    //automatically click the alert button

//    public void timeAlertButton() throws InterruptedException {
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(AlertButton))
//                .click();
//
//        Thread.sleep(5000);
//    }
//
//
//    public void okAlertButton() throws InterruptedException {
//        new WebDriverWait(driver, Duration.ofSeconds(3));
//        System.out.println("alert1 " + alert1.getText());
//        alert1.accept();
//
//    }

    //Confirmation alertBox which include ok and cancel

    public void confirmAlertButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(ConfirmButton))
                .click();
    }

    public void confirmAlert() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("alert1 " + alert1.getText());
        alert1.dismiss();
        Thread.sleep(5000);
    }

    //prompt alertBox which include text field,ok,cancel

    public void getPromptButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(PromtButton))
                .click();
    }

    public void promptAlert() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10));
        alert1.sendKeys("test the project bro yes becoming QA in future");
        alert1.dismiss();
        Thread.sleep(5000);
    }

    //explicitWait means we can run without a switch in to alert

    public void explicitWaitButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(AlertButton))
                .click();
        Thread.sleep(5000);
    }


    public void explicitButton() throws InterruptedException {
       Alert web= new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.alertIsPresent());
        System.out.println(web.getText());
       web.accept();
    }

}
