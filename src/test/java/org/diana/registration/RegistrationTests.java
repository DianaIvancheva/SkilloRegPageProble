package org.diana.registration;

import org.diana.POM.HomePage;
import org.diana.POM.RegistrationPage;
import org.diana.base.BaseTest;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest {

    @Test
    public void registerWithValidData() {
        RegistrationPage registrationPage = new RegistrationPage(super.driver);
        registrationPage.navigateToRegPage();
        //STEP 1: Open registration page
        //1.1 Verify reg url is correctly loaded
        //1.2 Verify "Sign up" title

        //STEP 2: Fill all mandatory fields

        //STEP 3: Click on reg form submit button

        //STEP 4: Verify success msg is presented to the user

        //STEP 5: All posts page (http://training.skillo-bg.com:4300/posts/all)
        //4.1 Verify that logout button is visible
        //4.2 Verify user is redirected to posts(followers) page
        //4.3 Verify "Profile" is visible in nav bar
    }

}
