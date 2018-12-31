package com.imogim.qa.pages;

import com.imogim.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage extends TestBase {

    @FindBy(xpath = "//input[@name='firstname']")
    //@FindBy(id = "input-firstname")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='telephone']")
    WebElement telephone;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='confirm']")
    WebElement passwordConfirmation;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueBtn;

    public RegisterAccountPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyRegister(){
        firstName.sendKeys("Test");
        lastName.sendKeys("One");
        email.sendKeys("testone@test.com");
        telephone.sendKeys("01234567891");
        password.sendKeys("Test01");
        passwordConfirmation.sendKeys("Test01");
        privacyPolicyCheckbox.click();
        continueBtn.click();
    }
}
