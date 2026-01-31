package TestNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HrmOrganization {
    protected WebDriver driver;
    @BeforeClass
    public void  HrmOrganizations() {
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");

        String title = driver.getTitle();
        System.out.println("title is " + title);
    }

       @Test
      public  void email() {
            driver.findElement(By.id("Email")).clear();
            driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
        }

        @Test
        public void password() {
            driver.findElement(By.id("Password")).clear();
            driver.findElement(By.id("Password")).sendKeys("admin");
        }
        @Test
        public void click() {
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")).click();
        }

@AfterClass
    public void  HrmOrganizationsAfterClass() {
driver.quit();
    }
}
