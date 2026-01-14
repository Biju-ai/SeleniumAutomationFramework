import org.example.base.Autosuggestion;
import org.example.pages.AutoSuggestionClass;
import org.testng.annotations.Test;

public class AutoSuggestionTest extends Autosuggestion {

    @Test
    public void AutoSuggestionTest() throws InterruptedException {
        AutoSuggestionClass autosuggestion = new AutoSuggestionClass(driver);
        autosuggestion.clickSearchButton("hehe");

    }
}
