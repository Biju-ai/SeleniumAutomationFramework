import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class BrokenLink {

    /*
    1) link href="https://xyz.com"

    2) http://xyz.com --->server --->status code

    3) status code>=400 broken link
    status code<400 nota broken link
     */
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> list = driver.findElements(By.tagName("a"));
        int noOFBrokenLinks = 0;
        for (WebElement el : list) {
            String href = el.getAttribute("href");
            if (href == null || href.isEmpty()) {
                System.out.println("href is empty");
                continue;
            }
            try {
                //hit url to the server
                URL url = new URL(href);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                if (connection.getResponseCode() >= 400) {
                    System.out.println(href + "Broken link");
                    noOFBrokenLinks++;
                } else {
                    System.out.println(href + "Not Broken link");
                }
            } catch (Exception e) {
                System.out.println(href + "Exception occurred");
            }
        }
        System.out.println("Number of broken list"+noOFBrokenLinks);
    }
}
