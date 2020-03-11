package pl.krysinski.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Button extends BaseElement {

    public Button(By locator) {
        super(locator);
    }

    public void click(){
        waitUntilClickable().click();
    }

}
