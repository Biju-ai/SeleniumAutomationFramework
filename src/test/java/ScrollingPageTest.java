import org.example.base.ScrollingPage;
import org.example.pages.ScrollingPageClass;
import org.testng.annotations.Test;

public class ScrollingPageTest extends ScrollingPage {
    @Test
    public void scrollDown() throws InterruptedException {
        ScrollingPageClass scrollingPage = new ScrollingPageClass(driver);
//        scrollingPage.scrollDown();
//        scrollingPage.scrollTillElementIsVisible();
        scrollingPage.scrollingTillEnd();
    }
}
