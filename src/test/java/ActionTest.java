import org.example.base.PractiseForms;
import org.example.pages.ActionClass;
import org.testng.annotations.Test;

public class ActionTest extends PractiseForms {
    @Test
    public void ActionTest() throws InterruptedException {

        ActionClass action = new ActionClass(Driver);
        action.ClickingTheOption();
        action.writingWordsInUpperAndLowe();

    }
}
