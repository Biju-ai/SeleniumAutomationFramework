import org.example.base.JavascriptExecuterDemo;
import org.example.pages.JavascriptExecuterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JavascriptExecuterTest  extends JavascriptExecuterDemo{
    @Test
    public void JavascriptExecuterTest() {
    JavascriptExecuterClass js=new JavascriptExecuterClass(driver);
    js.getFirstName();
    js.getFemaleButton();

    }

}
