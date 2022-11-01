package pages.JuiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {
        public TextBox emailAddress = new TextBox(By.xpath("//input[@id='emailControl']"), "[Email] textbox in register section.");
        public TextBox passwordRegistration = new TextBox(By.xpath("//input[@id='passwordControl']"), "[Password] registration textbox in register section.");
        public TextBox repeatPassword = new TextBox(By.xpath("//input[@id=\"repeatPasswordControl\"]"), "[Repeat Password] textbox in register section");
        public Button securityQuestion = new Button(By.xpath("//div[@class=\"security-container\"]/mat-form-field[@class]"), "[Security Question] button in register section.");
        public TextBox answer = new TextBox(By.xpath("//input[@id='securityAnswerControl']"), "[Answer] textbox in register section.");
        public Button registerButton = new Button(By.xpath("//button[@id='registerButton']"), "[Register] button in register section");
        public Button motherNameOption = new Button(By.id("mat-option-4"), "[Mother's maiden name] option in security question drop-down button");
}
