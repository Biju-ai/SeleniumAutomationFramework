import org.example.base.DynamicPagination;
import org.example.pages.DynamicPaginationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DynamicPaginationTest extends DynamicPagination {
    @Test
    public void DynamicPagination() {

        DynamicPaginationPage dynamicPaginationPage = new DynamicPaginationPage(driver);
        dynamicPaginationPage.getUsername("admin");
        dynamicPaginationPage.getPassword("admin");


    }
}
