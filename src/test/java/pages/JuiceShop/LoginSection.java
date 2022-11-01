package pages.JuiceShop;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public Button newCostumerLink = new Button(By.xpath("//a[@class='primary-link']"), "[Costumer] link button in login section");
    public TextBox emailLogin = new TextBox(By.xpath("//input[@id='email']"), "[Email] textbox in login section");
    public TextBox pwdLogin = new TextBox(By.xpath("//input[@id='password']"), "[Password] textbox in login section");
    public Label label = new Label(By.xpath("//h1[text()=\"Login\"]"), "[login] label in login section");
    public TextBox loginButtonSection = new TextBox(By.xpath("//button[@id='loginButton']"), "[Login] button in login section");



}
