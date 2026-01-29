import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class HardAssertionsVsSoftAssertions {
//    @Test

    public void hardAssertions(){
        System.out.println("hardAssertions");
        System.out.println("hardAssertions");
        Assert.assertEquals("123",123);//hart assertion

        System.out.println("hardAssertions down ");
        System.out.println("hardAssertions down2");
    }

    @Test
    public void softAssertions(){
        System.out.println("softAssertions");
        System.out.println("softAssertions");

        SoftAssert aser=new SoftAssert();//creating soft skills
        aser.assertEquals("123",123);
        System.out.println("softAssertions");
        System.out.println("softAssertions");
        aser.assertAll(); //mandatory
    }
}
