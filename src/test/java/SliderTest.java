import org.example.base.PractiseForms;
import org.example.pages.SliderClass;
import org.testng.annotations.Test;

public class SliderTest extends PractiseForms {
    @Test
    public void sliderTest() throws InterruptedException {
        SliderClass sliderClass = new SliderClass(Driver);
        sliderClass.getSliderValue();
        sliderClass.getSliderText();
        sliderClass.getSliderBottom(50);
    }
}
