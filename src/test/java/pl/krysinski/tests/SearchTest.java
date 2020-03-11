package pl.krysinski.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.krysinski.HomePage;
import pl.krysinski.baseTest.BaseTest;

public class SearchTest extends BaseTest {
    private HomePage homePage;

    @BeforeTest
    void init(){
        homePage = new HomePage();
        homePage.openHomePage();

    }

    @Test
    void testSearching(){
        homePage.search("Kino");
        Assert.assertTrue(homePage.titleInHeader().contains("Kino"), "Title header don't contains 'Kino'");
    }
}
