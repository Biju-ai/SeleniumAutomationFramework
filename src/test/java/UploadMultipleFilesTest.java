import org.example.base.UploadingMultipleFiles;
import org.example.pages.UploadingMultipleFilesClass;
import org.testng.annotations.Test;

public class UploadMultipleFilesTest extends UploadingMultipleFiles {
    @Test
    public void UploadMultipleFiles() throws InterruptedException {
        UploadingMultipleFilesClass uploadingMultipleFilesClass = new UploadingMultipleFilesClass(driver);
        uploadingMultipleFilesClass.uploadPicture("");
        String text1="";
        String text2="";
        uploadingMultipleFilesClass.uploadPicture(text1+"\n"+text2+"\n");
    }
}
