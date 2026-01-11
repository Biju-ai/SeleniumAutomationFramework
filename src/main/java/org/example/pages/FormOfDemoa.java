package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormOfDemoa {
    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement firstNameTextbox;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement firstNameTextbox2;

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    WebElement EmailTextbox;

    @FindBy(xpath = "//*[@id=\"userNumber\"]")
    WebElement MobileTextbox;

    @FindBy(xpath = "//*[@id=\"dateOfBirthInput\"]")
    WebElement DobTextbox;

    @FindBy(xpath = "//*[@id=\"uploadPicture\"]")
    WebElement uploadPicture;

    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    WebElement CurrentTextbox;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement SubmitTextbox;

    public FormOfDemoa(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void getFirstNameTextbox(String name) {
        firstNameTextbox.sendKeys(name);
    }
    public void getFirstNameTextbox2(String name) {
        firstNameTextbox2.sendKeys(name);
    }
    public void getEmailTextbox(String email) {
        EmailTextbox.sendKeys(email);
    }
    public void getMobileTextbox(String mobile) {
        MobileTextbox.sendKeys(mobile);
    }
    public void getDobTextbox(String dob) {
        DobTextbox.sendKeys(dob);
    }
    public void selectSubject(String subject) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 1. Wait for container to be present
        WebElement container = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("subjectsContainer"))
        );

        // 2. Scroll into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", container);

        // 3. Click using JS to avoid interception by floating elements
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", container);

        // 4. Wait for the input inside the container
        WebElement input = container.findElement(By.tagName("input"));
        wait.until(ExpectedConditions.elementToBeClickable(input));

        // 5. Type the subject and press ENTER
        input.sendKeys(subject);
        input.sendKeys(Keys.ENTER);
    }


    // Sport checkbox
    public void selectHobbies(String... hobbies) {
        for (String hobby : hobbies) {
            // Build XPath dynamically based on 'for' attribute
            String xpath = "//label[@for='" + hobby + "']";

            WebElement checkboxLabel = driver.findElement(By.xpath(xpath));

            // Scroll into view just in case
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkboxLabel);

            // Click using JS to avoid interception
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxLabel);
        }
    }

    public void getPicture(String PicturePath) {
        uploadPicture.sendKeys(PicturePath);
    }

    // State

    public void selectState(String value) throws InterruptedException {
        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys(value);
        Thread.sleep(500); // short wait for React to populate
        state.sendKeys(Keys.ENTER);
    }

    // City

    public void selectCity(String value) throws InterruptedException {
        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys(value);
        Thread.sleep(500);
        city.sendKeys(Keys.ENTER);
    }
    public void getCurrentTextbox(String current) {
        CurrentTextbox.sendKeys(current);
    }

    public void getSubmitTextbox() {
        SubmitTextbox.submit();
    }

}
