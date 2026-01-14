package org.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutoSuggestionClass {
    protected WebDriver driver;
    public AutoSuggestionClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "p")
    WebElement searchBox;


    public void clickSearchButton(String searchText) {
       new WebDriverWait(driver, Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(searchBox));
       searchBox.sendKeys(searchText);
    }
}
