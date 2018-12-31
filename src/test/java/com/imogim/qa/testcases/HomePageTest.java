package com.imogim.qa.testcases;

import com.imogim.qa.base.TestBase;
import com.imogim.qa.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTest extends TestBase {

    HomePage homePage;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialiseDriver();
        homePage = new HomePage();
    }

    @Test
    public void verifyPageTitleTest(){
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("Imogim", pageTitle, "Page title mismatch.");
    }

    @Test
    public void verifyLogoTest(){
        assertTrue(homePage.verifyLogo());
    }

    @Test
    public void verifyHotDealsLinkTest(){
        homePage.verifyHotDealsLink();
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("Hot Deals", pageTitle, "Page title mismatch.");
    }

    @Test
    public void verifyNewArrivalsLinkTest(){
        homePage.verifyNewArrivalsLink();
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("New Arrivals", pageTitle, "Page title mismatch");
    }

    @Test
    public void verifyBestSellersLinkTest(){
        homePage.verifyBestSellersLink();
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("Best Sellers", pageTitle, "Page title mismatch");
    }

    @Test
    public void verifyFeaturedProductsLinkTest(){
        homePage.verifyFeaturedProductsLink();
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("Featured Products", pageTitle, "Page title mismatch");
    }

    @Test
    public void verifyContactUsLinkTest(){
        homePage.verifyContactUsLink();
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("Contact Us", pageTitle, "Page title mismatch");
    }

    @Test
    public void verifyRegisterLinkTest(){
        homePage.verifyRegisterLink();
        String pageTitle = homePage.verifyPageTitle();
        assertEquals("Register Account", pageTitle, "Page title mismatch.");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
