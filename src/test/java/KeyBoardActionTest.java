import org.example.base.KeyboardAction;
import org.example.pages.KeyBoardActionClass;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class KeyBoardActionTest extends KeyboardAction {
    @Test
    public void KeyBoardAction() throws InterruptedException {
        KeyBoardActionClass keyBoardActionClass = new KeyBoardActionClass(driver);
        keyBoardActionClass.getFirstText("welcome to the QA");
        keyBoardActionClass.copyText();
    }
}
