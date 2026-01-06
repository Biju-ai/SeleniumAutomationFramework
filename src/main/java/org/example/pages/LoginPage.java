package org.example.pages;

import org.example.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    //using page factory
    @FindBy(id="Email")
    WebElement usernameTextbox;
    @FindBy(id="Password")
    WebElement passwordTextbox;
    @FindBy(xpath="//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")
    WebElement loginButtonBox;

    //using POM(page object model)
//    private By email = By.id("Email");
//    private By password = By.id("Password");
//    private By submit = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String Email) {
        usernameTextbox.clear();
        usernameTextbox.sendKeys(Email);

        //pom
//        driver.findElement(email).clear();
//        driver.findElement(email).sendKeys(Email);

    }
    public void enterPassword(String Password) {
        passwordTextbox.clear();
        passwordTextbox.sendKeys(Password);

        //pom
//        driver.findElement(password).click();
//        driver.findElement(password).sendKeys(Password);

    }
    public void clickSubmit() {
        Log.info("Clicking submit");
        loginButtonBox.submit();
//        driver.findElement(submit).click();
    }

}
