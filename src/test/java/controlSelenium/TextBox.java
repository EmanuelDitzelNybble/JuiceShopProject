package controlSelenium;

import org.openqa.selenium.By;

public class TextBox extends Control {


    public TextBox(By locator, String controlName) {
        super(locator, controlName);
    }

    public void setText(String value){
        this.findControl();
        this.step("Set on control: "+controlName+" the value: ["+value+"]");
        this.control.clear();
        this.control.sendKeys(value);
    }
}
