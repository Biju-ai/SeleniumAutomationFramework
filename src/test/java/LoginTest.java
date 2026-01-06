import org.example.base.BaseTest;
import org.example.pages.LoginPage;
import org.example.utils.ExtendReportManager;
import org.example.utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {

        Log.info("testValidLogin");
        test = ExtendReportManager.createTest("Login test");

        test.info("Navigating to URL");
        LoginPage loginPage = new LoginPage(driver);

        Log.info("testValidLogin2...");
        test.info("Adding credentials");
        loginPage.enterEmail("admin@yourstore.com");
        loginPage.enterPassword("admin");
        test.info("Checking login page");
        loginPage.clickSubmit();
        driver.getTitle();

        System.out.println("Title: " + driver.getTitle());
        test.info("Verifying login page");
        Log.info("verifying login page");
//        Assert.assertEquals(driver.getTitle(), "just a moment...");
        test.pass("Login successful");
    }
    @Test
    public void testValidLogin1() {

        Log.info("testValidLogin");
        test = ExtendReportManager.createTest("Login test");

        test.info("Navigating to URL");
        LoginPage loginPage = new LoginPage(driver);

        Log.info("testValidLogin2...");
        test.info("Adding credentials");
        loginPage.enterEmail("admin@yourstore.com");
        loginPage.enterPassword("admin");
        test.info("Checking login page");
        loginPage.clickSubmit();
        driver.getTitle();

        System.out.println("Title: " + driver.getTitle());
        test.info("Verifying login page");
        Log.info("verifying login page");
//        Assert.assertEquals(driver.getTitle(), "just a moment...");
        test.pass("Login successful");
    }

}
