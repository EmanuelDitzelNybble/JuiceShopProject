package pages.JuiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class WelcomePopUp {
    public Button dismissButton = new Button(By.xpath("//span[text()='Dismiss']"), "[Dismiss] button in welcome pop-up");
}
