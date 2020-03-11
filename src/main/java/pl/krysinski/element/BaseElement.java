package pl.krysinski.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.krysinski.driver.BaseDriver;
import java.util.List;


public class BaseElement {

    private WebDriver driver = BaseDriver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 30);
    private By locator;

    public BaseElement(By locator){
        this.locator = locator;
    }

    WebElement waitUntilVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    WebElement waitUntilClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean isDisplayed(String xpath){
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean isEnabled(){
        return waitUntilVisible().isEnabled();
    }

    public String getText(){
        return waitUntilVisible().getText();
    }

    public String getAttribute(String attribute){
        return waitUntilVisible().getAttribute(attribute);
    }

    protected List<WebElement> getElements(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElements(locator);
    }



}
