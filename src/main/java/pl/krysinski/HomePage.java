package pl.krysinski;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.krysinski.driver.BaseDriver;
import pl.krysinski.element.Button;
import pl.krysinski.element.Fields;
import pl.krysinski.element.TextField;

public class HomePage {

    private WebDriver driver = BaseDriver.getDriver();

    private Fields contactField;
    private Fields mailField;
    private Button rodoButton;
    private Button searchButton;
    private TextField searchField;


    public HomePage(){
        contactField = new Fields(By.xpath("//a[contains(text(),'Kontakt')]"));
        mailField= new Fields(By.xpath("//a[contains(text(),'info@trojmiasto.pl')]"));
        rodoButton = new Button(By.xpath("//*[@id='rodo_accept']"));
        searchButton = new Button(By.xpath("//input[@id='search_submit_button']"));
        searchField = new TextField(By.xpath("//input[@id='search_input']"));
    }

    public HomePage openHomePage(){
        driver.get("https://www.trojmiasto.pl/");
        return this;
    }

    public String titleInHeader(){
        return driver.getTitle() ;
    }

    public void clickContactField(){
        contactField.clickField();
    }

    public boolean isClickable()
    {
        try
        {
            mailField.clickField();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void scrollDownAtTheBottomPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void switchingToTheContactPage(){

        scrollDownAtTheBottomPage();
        clickContactField();
    }

    public void search(String searchString){
        searchField.setText(searchString);
        searchButton.click();
    }
    public void clickRodoButton(){
        rodoButton.click();
    }

    public WebElement rodoMessage(){
        return rodoButton.isDisplayed("rodo_info");
    }
}
