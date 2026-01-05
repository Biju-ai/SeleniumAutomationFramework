import org.example.base.BaseTast;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTast {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickSubmit();
        driver.getTitle();
        System.out.println("Title: " + driver.getTitle());
    }

}
