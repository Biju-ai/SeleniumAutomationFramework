import org.example.base.BaseTest;
import org.example.base.PractiseForms;
import org.example.pages.AlertClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest extends PractiseForms {
    @Test
    public void AlertTest() throws InterruptedException {
        AlertClass alertClass = new AlertClass(Driver);
        alertClass.getDropDown();
        alertClass.clickAlert();
//        alertClass.timeAlertButton();
//        alertClass.okAlertButton();
//        alertClass.confirmAlertButton();
//        alertClass.confirmAlert();
        alertClass.getPromptButton();
        alertClass.promptAlert();
        alertClass.explicitButton();
        alertClass.explicitWaitButton();


    }
}
