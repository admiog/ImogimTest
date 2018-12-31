package com.imogim.qa.testcases;

import com.imogim.qa.base.TestBase;
import com.imogim.qa.pages.RegisterAccountPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterAccountPageTest extends TestBase {

    RegisterAccountPage registerAccountPage;

    public RegisterAccountPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialiseDriver();
        registerAccountPage = new RegisterAccountPage();
    }

    @Test
    public void verifyRegisterTest(){
        registerAccountPage.verifyRegister();
        String pageTitle = driver.getTitle();
        assertEquals("Your Account Has Been Created!", pageTitle, "Page title mismatch.");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
