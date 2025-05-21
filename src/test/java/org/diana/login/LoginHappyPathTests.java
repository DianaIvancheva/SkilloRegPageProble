package org.diana.login;

import org.diana.POM.HomePage;
import org.diana.POM.LoginPage;
import org.diana.base.BaseTest;
import org.testng.annotations.Test;

public class LoginHappyPathTests extends BaseTest {

    public static final String HOME_PAGE_URL = "http://training.skillo-bg.com:4300/posts/all";

    @Test
    public void verifyUserCanNavigateToLoginPage() throws InterruptedException {

        HomePage homePage = new HomePage(super.driver);
        //Asert that the user is on the wanted page
        homePage.navigateToHomePage();
        homePage.clickOnLoginNavBar();

        LoginPage loginPage = new LoginPage(super.driver);

        loginPage.provideUser("Baba Marta");
        loginPage.providePass("1234567");
        loginPage.clickOnLoginFormSubmitButton();
        //Assert successful msg is shown when valid creds are provided
        Thread.sleep(777);
    }

}
