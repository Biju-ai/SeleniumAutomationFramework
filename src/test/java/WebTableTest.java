import org.example.base.WebTabel;
import org.example.pages.WebTableClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebTableTest extends WebTabel{
    @Test
    public void WebTableTest() {
        WebTableClass webTable = new WebTableClass(driver);
        webTable.getTable();
        webTable.getColumnTable();
        webTable.getTableData();
        webTable.getAllText();
    }
}
