package pages.JuiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class NavBarSection {
    public Button accountButton = new Button(By.xpath("//button[@id=\"navbarAccount\"]"), "[Account] button in navigation bar");
    public Button loginButton = new Button(By.xpath("//button[@id='navbarLoginButton']"), "[Login] button in navigation bar");
    public Button logoutButton = new Button(By.id("navbarLogoutButton"), "[Logout] button in navigation bar");
    public Button cartBasket = new Button(By.xpath("//button[@routerlink=\"/basket\"]"), "[Cart] button in navigation bar");
    public Button openSideButton = new Button(By.xpath("//mat-icon[normalize-space()='menu']"), "[Open Side Menu] button in navigation bar");
}
