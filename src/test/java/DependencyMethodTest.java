import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyMethodTest {

    //This method shows that each method is dependent on each other
    @Test(priority = 1)
    public void test1(){
        Assert.assertTrue(true);
    }
    @Test(priority = 2,dependsOnMethods={"test1"})
    public void test2(){
        Assert.assertTrue(false);
    }
    @Test(priority = 3,dependsOnMethods={"test2","test1"})// both the method should be executed to run this method, so if one of the methods is fail then it would not execute
    public void test3(){
        System.out.println("test3");
    }
    @Test(priority = 4,dependsOnMethods={"test3","test2","test1"})//we can depend on many methods so can add n number of methods
    public void test4(){
        System.out.println("test4");
    }
}
