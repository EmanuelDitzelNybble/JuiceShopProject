package cleanTest.JuiceShop;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComplaintSectionTest extends TestBaseJuiceShop {
    @Test
    @DisplayName("Verify that the user is able to send a complaint")
    @Description("This test case is to verify the complaint section using valid credentials")
    @Owner("Emanuel")
    @Link("www.jira.com/doc047")
    @Epic("Complaint")
    @Feature("Complaint section feature")
    @Severity(SeverityLevel.NORMAL)
    @Story("Complaint messages")
    public void costumerFeedbackTest() throws InterruptedException {
        welcomePopUp.dismissButton.click();

        //navbar Section
        navBarSection.accountButton.click();
        navBarSection.loginButton.waitClickable();
        navBarSection.loginButton.click();

        // Login Section
        login.emailLogin.addText(k.email1);
        login.pwdLogin.addText(k.pwd1);
        login.loginButtonSection.waitClickable();
        login.loginButtonSection.click();
        Assertions.assertTrue(navBarSection.openSideButton.isControlDisplayed(), "LOGIN ERROR");

        // Open Side Menu
        navBarSection.openSideButton.waitClickable();
        navBarSection.openSideButton.click();

        // Complaint Section
        complaintSection.complaintbutton.waitClickable();
        complaintSection.complaintbutton.click();
        complaintSection.complaint.setText(k.setComment);
        complaintSection.submitButton.waitClickable();
        complaintSection.submitButton.click();
        //complaintSection.confirmation.isControlDisplayed();
        //Assertions.assertTrue(complaintSection.confirmation.isControlDisplayed(),"Error sending complaint message");
    }
}


