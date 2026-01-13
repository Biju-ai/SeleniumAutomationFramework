import org.example.base.PractiseForms;
import org.example.pages.FormOfDemoa;
import org.testng.annotations.Test;

public class FormTest extends PractiseForms {

    @Test
    public void FormTest() throws InterruptedException {
        FormOfDemoa formOfDemoa = new FormOfDemoa(Driver);
        formOfDemoa.getFirstNameTextbox("First Name");
        formOfDemoa.getFirstNameTextbox2("second Name");
        formOfDemoa.getEmailTextbox("Email");
        formOfDemoa.getMobileTextbox("987654321");
        formOfDemoa.getDobTextbox("09/5/2022");

        //selecting multiple subjects
        formOfDemoa.selectSubject("Math");
        formOfDemoa.selectSubject("Computer");

        //clicking problem
        formOfDemoa.selectHobbies("hobbies-checkbox-1", "hobbies-checkbox-2");

        //uploading file
        formOfDemoa.getPicture("C:\\Users\\ACER\\Pictures\\Screenshots\\image.png");

        //dropdown problem
        formOfDemoa.getCurrentTextbox("Current");
        formOfDemoa.selectState("NCR");
        formOfDemoa.selectCity("Uttar Pradesh");

        formOfDemoa.getSubmitTextbox();




    }


}
