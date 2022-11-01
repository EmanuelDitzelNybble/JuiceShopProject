package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome implements IBrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        return driver;
    }
}
