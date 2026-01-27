package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollingPageClass {
    protected WebDriver driver;

    public ScrollingPageClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Static Web Table']")
    WebElement viewElement;

    //scrolling the page using pixel level
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(5000);

    }

    //Scrolling the page until the item is visible
    public void scrollTillElementIsVisible() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", viewElement);
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);
    }

    public void scrollingTillEnd() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
    }

    // getting back to its initial phase
    public void scrollingToInitialPositon() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

    public void zoomInZoomOut() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);
    }
}
