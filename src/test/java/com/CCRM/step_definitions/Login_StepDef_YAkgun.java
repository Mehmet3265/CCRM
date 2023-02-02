package com.CCRM.step_definitions;

import com.CCRM.pages.LoginPage;
import com.CCRM.utilities.BrowserUtils;
import com.CCRM.utilities.ConfigurationReader;
import com.CCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDef_YAkgun {

    LoginPage loginPage;


    @Given("User goes to the login page")
    public void user_goes_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
    }

    @When("User enters existing email {string} and password {string} and login")
    public void user_enters_existing_email_and_password_and_login(String email, String password) {
        loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @When("User should see the home page")
    public void user_should_see_the_home_page() {
        loginPage = new LoginPage();
        String actualHomePageTitle=loginPage.mapInHomePage.getText();
        String expectedHomePageTitle="sign in";
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
    }

    @Then("User should see the map")
    public void user_should_see_the_map() {
        BrowserUtils.waitFor(3);
    boolean result=loginPage.mapInHomePageImg.isDisplayed();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(result);
    }
}
