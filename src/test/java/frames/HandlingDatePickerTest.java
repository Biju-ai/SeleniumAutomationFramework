package frames;

import org.example.base.HandlingDatePicker;
import org.example.pages.HandlingDatePickerPage;
import org.testng.annotations.Test;

public class HandlingDatePickerTest extends HandlingDatePicker {
    @Test
    public void HandlingDatePickerTest() {
        HandlingDatePickerPage handlingDatePickerPage = new HandlingDatePickerPage(driver);
        handlingDatePickerPage.getDatePicker("02/02/2022");
    }

}
