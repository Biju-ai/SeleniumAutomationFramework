package org.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyBoardActionClass {
    protected WebDriver driver;

    public KeyBoardActionClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//textarea[@id='inputText1']")
    WebElement firstText;

    public void getFirstText(String text){
        firstText.click();
        firstText.sendKeys(text);
    }
    public void copyText() throws InterruptedException {
        Actions actions = new Actions(driver);
        //ctrl+A selecting the text
        actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //ctrl+C pest the text
        actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //tab
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //ctrl+V
        actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        Thread.sleep(5000);
    }

}
