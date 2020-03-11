package pl.krysinski.baseTest;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pl.krysinski.driver.BaseDriver;

public class BaseTest {
    public BaseTest(){}

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        BaseDriver.instantiateWebDriver();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        BaseDriver.quitDriver();
    }
}