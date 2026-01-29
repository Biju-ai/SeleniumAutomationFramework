import org.example.base.JavascriptExecutorDemo;
import org.example.pages.JavascriptExecuterClass;
import org.testng.annotations.Test;

public class JavascriptExecutorTest extends JavascriptExecutorDemo {
    @Test
    public void JavascriptExecutor() {
        JavascriptExecuterClass js = new JavascriptExecuterClass(driver);
        js.getFirstName();
        js.getFemaleButton();

    }
}
