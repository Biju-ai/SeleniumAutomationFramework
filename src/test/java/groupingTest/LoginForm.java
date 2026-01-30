package groupingTest;

import org.testng.annotations.Test;

public class LoginForm {
    @Test(priority=1,groups = {"senate"})
    public void fb(){
        System.out.println("loginFb");
    }
    @Test(priority = 2,groups = {"senate"})
    public void loginYoutube(){
        System.out.println("loginYoutube");
    }
    @Test(priority = 3,groups = {"recreation"})
    public void loginTwitter(){
        System.out.println("loginTwitter");
    }
}
