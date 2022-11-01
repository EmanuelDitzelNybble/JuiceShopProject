package controlSelenium;

import org.openqa.selenium.By;

public class CheckBox extends Control{
    public CheckBox(By locator, String controlName) {
        super(locator, controlName);
    }

    public void check(){
        this.findControl();
        if (!this.control.isSelected())
            control.click();
        this.step("Check the control "+this.controlName);
    }


    public void uncheck(){
        this.findControl();
        if (this.control.isSelected())
            control.click();
        this.step("Uncheck the control "+this.controlName);
    }
}