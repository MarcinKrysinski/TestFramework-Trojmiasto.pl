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
    void testAcceptRodoMessage(){

        homePage.clickRodoButton();
        boolean test = homePage.rodoButtonIsDisplay();
        System.out.println(test);
        Assert.assertFalse(homePage.rodoButtonIsDisplay(), "Rodo message didn't accepted");
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
