import org.example.base.ShadowDOM;
import org.example.pages.ShadowDOMClass;
import org.testng.annotations.Test;

public class ShadowDOMTest extends ShadowDOM {
    @Test
    public void shadowDOMTest() throws InterruptedException {
        ShadowDOMClass shadowDOMClass = new ShadowDOMClass(driver);
        shadowDOMClass.getShadowDOMClass("biju shrestha");
    }
}
