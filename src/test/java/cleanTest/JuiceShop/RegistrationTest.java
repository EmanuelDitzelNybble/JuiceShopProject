package cleanTest.JuiceShop;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class RegistrationTest extends TestBaseJuiceShop {
    @Test
    @DisplayName("Verify registration is successfully")
    @Description("This test case is to verify the registration and logout using valid credentials with any role")
    @Owner("Emanuel")
    @Link("www.jira.com/doc033")
    @Epic("Registration")
    @Feature("Authentication")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story Registration")
    public void registerAndLogout() throws InterruptedException {

        welcomePopUp.dismissButton.click();

        //navbar Section
        navBarSection.accountButton.click();
        navBarSection.loginButton.waitClickable();
        navBarSection.loginButton.click();

        //Login to Register
        login.newCostumerLink.waitClickable();
        login.newCostumerLink.click();

        //Register
        registerSection.emailAddress.addText(k.email);
        registerSection.passwordRegistration.addText(k.pwd);
        registerSection.repeatPassword.addText(k.pwd);
        registerSection.securityQuestion.click();
        registerSection.motherNameOption.waitClickable();
        registerSection.motherNameOption.click();
        registerSection.answer.addText(k.answer);
        registerSection.registerButton.waitClickable();
        registerSection.registerButton.click();
        Assertions.assertTrue(login.label.isControlDisplayed(), "REGISTRATION ERROR");
        //Login
        login.emailLogin.addText(k.email);
        login.pwdLogin.addText(k.pwd);
        login.loginButtonSection.waitClickable();
        login.loginButtonSection.click();
        Assertions.assertTrue(navBarSection.openSideButton.isControlDisplayed(), "LOGIN ERROR");
        //Logout
        navBarSection.accountButton.click();
        navBarSection.logoutButton.click();
        Assertions.assertFalse(navBarSection.cartBasket.isControlDisplayed(), "LOGOUT ERROR");
    }
}
