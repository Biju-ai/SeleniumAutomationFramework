import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
    @Test
    public void Assertions(){
        String name1="opera";
        String name2="opera";
//        if(name1.equals(name2)){
//            System.out.println("correct");
//        }else {
//            System.out.println("fails");
//        }

        Assert.assertEquals(name1,name2);
    }
    @Test
    public void Assertions2(){
        Assert.assertNotEquals("123",123);
//        Assert.assertTrue(true);
//        Assert.assertTrue(1==1);
//        Assert.assertFalse(1==2);
//        Assert.fail();
    }
}
