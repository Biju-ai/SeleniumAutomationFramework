import org.example.base.DataProvider;
import org.example.pages.DataProviderClass;
import org.testng.annotations.Test;

public class DataProviderTest extends DataProvider {
    @org.testng.annotations.DataProvider(name="db",indices = {0,3})//we can test a list of an object according to our choice
    public Object[][] getData(){
        Object [][] data = {{"biju@2bji","B2qwe"},//0
                {"hehe","nono"},//1
                {"biju@gmail.com","Biju@12"},//2
                {"biju@r","Nono"}//3

        };
        return  data;
    }

    @Test(dataProvider = "db")
    public void  dataProvider(String email,String password){
        DataProviderClass dataProviderClass = new DataProviderClass(driver);
        dataProviderClass.login(email,password);

    }
}
