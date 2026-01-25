package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class WebTableClass {
    protected WebDriver driver;

    public WebTableClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //finding total table row
    public int getTable() {
        WebDriverWait table = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> rows = table.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//table[@name='BookTable']//tr")
                )
        );
        System.out.println("The total number of rows"+rows.size());
        return rows.size();
    }

    //finding total column

    public int getColumnTable() {
        WebDriverWait table = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> rows = table.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//table[@name='BookTable']//th")
                )
        );
        System.out.println("The total number of colum"+rows.size());
        return rows.size();
    }

    //getting the text form the table
    public String getTableData(){
        WebDriverWait table = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement cell = table.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//table[@name='BookTable']//tr[5]/td[1]")
                )
        );

        String text = cell.getText();
        System.out.println("The text is: " + text);
        return text;

    }
    public String getAllText() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> rows = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//table[@name='BookTable']//tr")
                )
        );

        StringBuilder fullText = new StringBuilder();

        for (int r = 1; r <= rows.size(); r++) {

            List<WebElement> columns = driver.findElements(
                    By.xpath("//table[@name='BookTable']//tr[" + r + "]//td")
            );

            for (int c = 1; c <= columns.size(); c++) {

                String cellText = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")
                ).getText();

                System.out.print(cellText + "  ");
                fullText.append(cellText).append("  ");
            }
            System.out.println();
            fullText.append("\n");
        }
        return fullText.toString();
    }


}
