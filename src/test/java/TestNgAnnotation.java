import org.testng.annotations.*;

public class TestNgAnnotation {

    @BeforeClass
    public void login(){
        System.out.println("login");

    }
    @Test
    public void method1(){
        System.out.println("method");
    }

    @Test
    public void method2(){
        System.out.println("method2");
    }
    @AfterClass

    public void logout(){
        System.out.println("logout");
    }
}
