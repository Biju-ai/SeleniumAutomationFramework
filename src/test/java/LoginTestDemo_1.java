import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestDemo_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");

       String title= driver.getTitle();
       System.out.println("title is "+title);

        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")).click();

        driver.quit();
    }
}
