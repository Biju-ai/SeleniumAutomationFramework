package org.example.email;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import org.example.utils.Log;

import java.io.File;
import java.util.Properties;

public class EmailSender {
    public static void main(String[] args) {
        final String sendEMail = "nananstha@gmail.com";
        final String appPassword = "hokwhhzlwslrvyof";
        final String recipientEmail = "nananstha@gmail1.com";

        //SMTP server properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

        //create a session with authentication
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sendEMail, appPassword);

            }
        });

        session.setDebug(true);

        try {
            //Create message email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendEMail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Email Sender form QA");
//            message.setText("Hello \n this is the test email form java");

            // Email Body Part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hello \n this is the test email form java");

            //Attachment part
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
            String filePath = System.getProperty("user.dir") + "/reports/ExtentReports/ExtendReport.html";
            System.out.println("Attachment path is - " + filePath);
            Log.info("hello  i want the ans please");
            messageBodyPart2.attachFile(new File(filePath));

            //Combine email body and attachment parts
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(messageBodyPart2);
            message.setContent(multipart);

            //Send Email
            Transport.send(message);
            System.out.println("Email sent successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
