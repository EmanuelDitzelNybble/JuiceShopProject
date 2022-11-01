package cleanTest.JuiceShop;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class LoginTest extends TestBaseJuiceShop {
    @Test
    @DisplayName("Verify login is successfully")
    @Description("This test case is to verify the login using valid credentials with any role")
    @Owner("Emanuel")
    @Link("www.jira.com/doc032")
    @Epic("Login")
    @Feature("Authentication")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story Login")
    public void loginTest() throws InterruptedException{

        welcomePopUp.dismissButton.click();

        //navbar Section
        navBarSection.accountButton.click();
        navBarSection.loginButton.waitClickable();
        navBarSection.loginButton.click();

        login.emailLogin.addText(k.email);
        login.pwdLogin.addText(k.pwd);
        login.loginButtonSection.waitClickable();
        login.loginButtonSection.click();
        Assertions.assertTrue(navBarSection.openSideButton.isControlDisplayed(), "LOGIN ERROR");
    }
}
