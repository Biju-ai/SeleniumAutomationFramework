package groupingTest;

import org.testng.annotations.Test;

public class PaymentForm {

    @Test(priority = 1,groups = {"functional"})
    public void paymentFb(){
        System.out.println("paymentFb");
    }

    @Test(priority = 2,groups = {"sanate","regreation","funtional"})
    public void paymentYoutube(){
        System.out.println("paymentYoutube");
    }
    @Test(priority = 3,groups = {"regreation"})
    public void paymentTwitter(){
        System.out.println("paymentTwitter");
    }
}
