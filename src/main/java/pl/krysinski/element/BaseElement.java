package pl.krysinski.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.krysinski.driver.BaseDriver;



public class BaseElement {

    private WebDriver driver = BaseDriver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 30);
    private By locator;

    public BaseElement(By locator){
        this.locator = locator;
    }

    WebElement waitUntilClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement isDisplayed(String id){
        return driver.findElement(By.id(id));
    }

}
