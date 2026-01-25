package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SliderClass {
    protected WebDriver driver;

    public SliderClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[4]/span[1]/div[1]")
    WebElement sliderBox;

    @FindBy(xpath = "//div[contains(@class,'element-list collapse show')]//li[@id='item-3']")
    WebElement slider;

    @FindBy(xpath = "//div[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']")
    WebElement sliderBottom;

    public void getSliderValue(){
        sliderBox.click();
    }

    public void getSliderText() throws InterruptedException {
        WebElement element=new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(slider));
        element.click();
        Thread.sleep(5000);
    }
    public void getSliderBottom(int value) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value='" + value + "'; arguments[0].dispatchEvent(new Event('change'));",
                sliderBottom
        );

        System.out.println("Slider value set to: " + value);
        Thread.sleep(5000);
    }



}
