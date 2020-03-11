package pl.krysinski.element;

import org.openqa.selenium.By;

public class Fields extends BaseElement {

    public Fields(By locator) {
        super(locator);
    }

    public void clickField(){
        waitUntilClickable().click();
    }
}
