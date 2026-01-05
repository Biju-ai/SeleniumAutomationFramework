import org.example.base.BaseTast;
import org.example.pages.LoginPage;
import org.example.utils.Log;
import org.testng.annotations.Test;

public class LoginTest extends BaseTast {
    @Test
    public void testValidLogin() {

        Log.info("testValidLogin");
        LoginPage loginPage = new LoginPage(driver);

        Log.info("testValidLogin2...");
        loginPage.enterEmail("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickSubmit();
        driver.getTitle();

        System.out.println("Title: " + driver.getTitle());
        Log.info("verifying login page");
    }

}
