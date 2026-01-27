import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {
    public static void main(String[] args) {
        ChromeOptions options =new ChromeOptions();
        options.addArguments("headless");//setting for the headless test execution
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/");
        System.out.println("Browser Windows Testing");

    }
}
