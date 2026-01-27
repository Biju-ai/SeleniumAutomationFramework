package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowDOMClass {
    protected WebDriver driver;

    public ShadowDOMClass(WebDriver driver) {
        this.driver = driver;
    }

    public void getShadowDOMClass(String name) throws InterruptedException {
        //This Element is inside single shadow DOM.
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys(name);


    }
}
