package cleanTest.JuiceShop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.JuiceShop.*;
import singletonSession.Session;

public class TestBaseJuiceShop {

    public LoginSection login = new LoginSection();
    public NavBarSection navBarSection = new NavBarSection();
    public RegisterSection registerSection = new RegisterSection();
    public K k = new K();
    public WelcomePopUp welcomePopUp = new WelcomePopUp();
    public ComplaintSection complaintSection = new ComplaintSection();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("http://localhost:3000/#/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
