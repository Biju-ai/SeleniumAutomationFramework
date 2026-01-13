import org.example.base.BaseTest;
import org.example.pages.LoginPage;
import org.example.utils.ExcelUtils;
import org.example.utils.ExtendReportManager;
import org.example.utils.Log;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @DataProvider(name="LoginData")
    public Object[][] getLoginData()throws Exception {
        String filePath = System.getProperty("user.dir") + "/testdata/testdata.xlsx";
        ExcelUtils.loadExcet(filePath, "sheet1");
        int rowCount = ExcelUtils.getRowCount();
        Object[][] data = new Object[rowCount - 1][2];
        for (int i = 0; i < rowCount; i++) {
            data[1][0]=ExcelUtils.getCellData(i,0);//Username
            data[1][1]=ExcelUtils.getCellData(i,1);//password

        }
        ExcelUtils.closeExcet();
        return data;

    }

//    @Test(dataProvider = "LoginData")
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

//        loginPage.enterEmail(username);
//        loginPage.enterPassword(password);
        test.info("Checking login page");
        loginPage.clickSubmit();
        driver.getTitle();

        System.out.println("Title: " + driver.getTitle());
        test.info("Verifying login page");
        Log.info("verifying login page");
//        Assert.assertEquals(driver.getTitle(), "just a moment...");
        test.pass("Login successful");
    }

//    @Test
//    public void testValidLogin1() {
//
//        Log.info("testValidLogin");
//        test = ExtendReportManager.createTest("Login test");
//
//        test.info("Navigating to URL");
//        LoginPage loginPage = new LoginPage(driver);
//
//        Log.info("testValidLogin2...");
//        test.info("Adding credentials");
//        loginPage.enterEmail("admin@yourstore.com");
//        loginPage.enterPassword("admin");
//        test.info("Checking login page");
//        loginPage.clickSubmit();
//        driver.getTitle();
//
//        System.out.println("Title: " + driver.getTitle());
//        test.info("Verifying login page");
//        Log.info("verifying login page");
//        Assert.assertEquals(driver.getTitle(), "just a moment...");
//        test.pass("Login successful");
//    }

}
