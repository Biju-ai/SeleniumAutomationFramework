package org.example.pages.frames.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class FramesPage {
    protected WebDriver driver;
    public FramesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html[1]/frameset[1]/frame[1]")
    WebElement frameset;

    @FindBy(xpath = "//input[@name='mytext1']")
    WebElement text1;

    @FindBy(xpath = "//frameset//frameset//frame[1]")
    WebElement frameset1;

    @FindBy(xpath = "//input[@name='mytext2']")
    WebElement text2;

    @FindBy(xpath = "//frameset//frameset//frame[2]")
    WebElement frameset2;

    @FindBy(xpath = "//input[@name='mytext3']")
    WebElement text3;

    @FindBy(xpath = "//iframe[normalize-space()='Loading...']")
    WebElement frameset3;

    @FindBy(xpath = "//div[@id='i6']//div[@class='AB7Lab Id5V1']")
    WebElement text4;


    //first frame
    public void getFrames(){
        frameset.click();
    }

    public void insertData(String text){
        driver.switchTo().frame(frameset);
        text1.sendKeys(text);
    }

    //second frame
    public void getFrames1(){
        driver.switchTo().defaultContent();
        frameset1.click();
    }
    public void insertData1(String text){
        driver.switchTo().frame(frameset1);
        text2.sendKeys(text);
    }

    //third frame
    public void getFrames2(){
        driver.switchTo().defaultContent();
        frameset2.click();
    }

    public void insertData2(String text){
        driver.switchTo().frame(frameset2);
        text3.sendKeys(text);
    }

    //innerFrame

    public void getFrames3(){
        driver.switchTo().frame(0);
    }
    public void insertData3(){
        text4.click();
    }

}
