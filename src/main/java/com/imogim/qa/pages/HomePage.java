package com.imogim.qa.pages;

import com.imogim.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    // Page Factory
    @FindBy(xpath = "//span[contains(text(), 'Categories')]")
    WebElement categoriesLabel;

    @FindBy(xpath = "//img[@title='Imogim']")
    WebElement imogimLogo;

    @FindBy(xpath = "//a[contains(text(), 'Hot Deals')]")
    WebElement hotDealsLabel;

    @FindBy(xpath = "//a[contains(text(), 'New Arrivals')]")
    WebElement newArrivalsLabel;

    //@FindBy(xpath = "//a[contains(text(), 'Best Sellers')]")
    @FindBy(linkText = "BEST SELLERS")
    WebElement bestSellersLabel;

    @FindBy(xpath = "//a[contains(text(), 'Featured Products')]")
    WebElement featuredProductsLabel;

    @FindBy(xpath = "//a[contains(text(), 'Contact Us')]")
    WebElement contactUsLabel;

    @FindBy(linkText = "My Account")
    WebElement accountsLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return imogimLogo.isDisplayed();
    }

    public HotDealsPage verifyHotDealsLink(){
        hotDealsLabel.click();
        return new HotDealsPage();
    }

    public NewArrivalsPage verifyNewArrivalsLink(){
        newArrivalsLabel.click();
        return new NewArrivalsPage();
    }

    public BestSellersPage verifyBestSellersLink(){
        bestSellersLabel.click();
        return new BestSellersPage();
    }

    public FeaturedProductsPage verifyFeaturedProductsLink(){
        featuredProductsLabel.click();
        return new FeaturedProductsPage();
    }

    public ContactUsPage verifyContactUsLink(){
        contactUsLabel.click();
        return new ContactUsPage();
    }

    public RegisterAccountPage verifyRegisterLink(){
        accountsLink.click();
        registerLink.click();
        return new RegisterAccountPage();
    }
}
