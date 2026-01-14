package frames;

import org.example.base.frames.Ui.Vesion;
import org.example.pages.frames.page.FramesPage;
import org.testng.annotations.Test;

public class test extends Vesion {

@Test
    public void test() {
        FramesPage framesPage = new FramesPage(driver);
        framesPage.getFrames();
        framesPage.insertData("hello biju how are you bro");
        framesPage.getFrames1();
        framesPage.insertData1("fragment two");
        framesPage.getFrames2();
        framesPage.insertData2("fragment three");
        framesPage.getFrames3();
        framesPage.insertData3();
    }
}
