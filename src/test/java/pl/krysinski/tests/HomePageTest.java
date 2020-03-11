package pl.krysinski.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.krysinski.HomePage;
import pl.krysinski.baseTest.BaseTest;



public class HomePageTest extends BaseTest{

    private HomePage homePage;

    @BeforeTest
    void init(){
        homePage = new HomePage();
        homePage.openHomePage();

    }

    @Test
    void testRodoMessageIsDisplay(){
        Assert.assertTrue(homePage.rodoMessage().isDisplayed(), "Rodo message didn't display");
    }

    @Test
    void testIsTheRightHomePageHeader(){

        Assert.assertEquals(homePage.openHomePage().titleInHeader(), "Trojmiasto.pl - wiadomości i informacje z Trójmiasta.");

    }

    @Test
    void testSearching(){
        homePage.search("Kino");
        Assert.assertTrue(homePage.titleInHeader().contains("Kino"), "Title header don't contains 'Kino'");
    }
}
