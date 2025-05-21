package org.diana.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistrationPage extends BasePage {

    //1.URL
    private static final String REGISTER_SUFIX = "/users/register";
    private static final String EXPECTED_REG_FORM_HEADER_TEXT = "Sign up";
    private static final String EXPECTED_REG_MSG = "Successful register!";

    //2.LOCATORS
    //Registration form
    String USERNAME_REG_INPUT_FIELD_XPATH = "//input[contains(@name, \"username\")]";
    String EMAIL_INPUT_FIELD_XPATH = "//input[contains(@type, \"email\")]";
    String BIRTH_DATE_INPUT_XPATH = "//input[contains(@formcontrolname, \"birthDate\")]";
    String PASSWORD_REG_INPUT_FIELD_CSS = "#defaultRegisterFormPassword";
    String CONFIRM_PASS_INPUT_CSS = "#defaultRegisterPhonePassword";
    String INFO_INPUT_XPATH = "//textarea";
    String SIGN_IN_BUTTON_CSS = "#sign-in-button";
    String SUCCESSFUL_REG_MSG_CSS = ".toast-message.ng-star-inserted";
    //When logged in
    //Registration page error messages
    //Registration page layout
    String SIGN_UP_FORM_HEADER_XPATH = "//h4";
    String PROFILE_BTN_CSS = "#nav-link-profile";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    //Navigation
    public void navigateToRegPage() {
        navigateTo(REGISTER_SUFIX);
    }

    //User actions
    WebElement usernameField = driver.findElement(By.xpath(USERNAME_REG_INPUT_FIELD_XPATH));

    public void provideUsername() {
        String username = demoUsername();
        fillField(usernameField, username);
    }

    //Support methods for reg page
    public String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        String formattedDateTime = now.format(formatter);
        return formattedDateTime;
    }

    public String demoUsername() {
        String username = "Demo" + getCurrentTime();
        return username;
    }

    public String randomValidEmail() {
        String email = "demo" + getCurrentTime() + "@gmail.com";
        return email;
    }
}
