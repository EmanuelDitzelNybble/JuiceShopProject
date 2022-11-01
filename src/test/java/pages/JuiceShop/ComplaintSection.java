package pages.JuiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class ComplaintSection {
    public Button complaintbutton = new Button(By.xpath("//span[normalize-space()='Complaint']"), "[Complaint] button in open side menu");
    public TextBox complaint = new TextBox(By.xpath("//textarea[@id='complaintMessage']"), "[Complaint] textbox in costumer feedback section");
    public Button submitButton = new Button(By.xpath("//i[normalize-space()='send']"), "[Submit] button in open side menu");
    public TextBox confirmation = new TextBox(By.xpath("//div[@class='confirmation']"), "Confirmation message in complaint section");

}
