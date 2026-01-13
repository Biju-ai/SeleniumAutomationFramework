package org.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActionClass {
    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span")
    WebElement clicking;
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement firstNameTextbox;


    public ActionClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void ClickingTheOption() throws InterruptedException {
        Actions action = new Actions(driver);
//        action.contextClick(clicking).build().perform();//it right click the mouse option
        action.moveToElement(clicking).contextClick().perform();
        Thread.sleep(5000);
    }
        public void writingWordsInUpperAndLowe() throws InterruptedException {
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).click(firstNameTextbox).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("iju").build().perform();
        Thread.sleep(5000);

        }

}
