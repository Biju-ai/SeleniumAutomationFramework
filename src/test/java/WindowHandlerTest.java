import org.example.base.PractiseForms;
import org.example.pages.ActionClass;
import org.example.pages.WindowHandlingDelo;
import org.testng.annotations.Test;

public class WindowHandlerTest extends PractiseForms {
    @Test
    public void WindowHandlerTests() throws InterruptedException {
        WindowHandlingDelo windowHandlingDelo = new WindowHandlingDelo(Driver);
        windowHandlingDelo.getDeopDown();
        windowHandlingDelo.clickBrowserWindows();
        windowHandlingDelo.clickNewTab();

    }
}