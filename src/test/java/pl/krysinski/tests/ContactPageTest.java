package pl.krysinski.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.krysinski.HomePage;
import pl.krysinski.baseTest.BaseTest;

public class ContactPageTest extends BaseTest{
    private HomePage homePage;

    @BeforeTest
    void init(){
        homePage = new HomePage();
        homePage.openHomePage();
        homePage.clickRodoButton();

    }

    @Test
    void testSwitchingToTheContactPage(){
        homePage.switchingToTheContactPage();
        Assert.assertEquals(homePage.titleInHeader(), "Kontakt - Trojmiasto.pl");
    }

    @Test
    void testLabelContactIsClickable(){
        homePage.switchingToTheContactPage();
        Assert.assertTrue(homePage.isClickable(), "Isn't clickable");
    }
}
