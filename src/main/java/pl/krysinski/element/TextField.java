package pl.krysinski.element;

import org.openqa.selenium.By;


public class TextField extends BaseElement {

    public TextField(By locator) {
        super(locator);
    }

    public void setText(String text){
        waitUntilClickable().sendKeys(text);
    }
}
