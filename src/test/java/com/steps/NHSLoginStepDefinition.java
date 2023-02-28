package com.steps;

import com.pages.NHSHomePage;
import com.pages.NHSLoginPage;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class NHSLoginStepDefinition {

    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsLoginPage = new NHSLoginPage(driver);
    NHSHomePage nhsHomePage = new NHSHomePage(driver);


    @Given("User navigates to the NHS website")
    public void user_navigates_to_the_nhs_website() {
    driver.get(ConfigReader.readProperty("QA_nhs_url"));

    }
    @When("User enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        nhsLoginPage.enterUsernamePassword(ConfigReader.readProperty("QA_username"), ConfigReader.readProperty("QA_password"));
    }

    @When("User click Sign in button")
    public void user_click_sign_in_button() {
        nhsLoginPage.successSignIn();
    }

    @Then("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        nhsHomePage.verifyTitleOfThePage(driver, "NHS patients");
    }

    @Then("User verifies the title is NHS Patient")
    public void user_verifies_the_title_is_nhs_patient() {
        nhsLoginPage.verifyTitle("NHS Patients");
    }

        @When("User enters username and invalid password")
    public void user_enters_username_and_invalid_password() throws InterruptedException {
        nhsLoginPage.enterUsernamePassword(ConfigReader.readProperty("QA_username"), ConfigReader.readProperty("QA_invalidPassword"));
    }

    @Then("User cannot login")
    public void user_cannot_login() {

    }

    @When("User enters username and blank password")
    public void user_enters_username_and_blank_password() throws InterruptedException {
        nhsLoginPage.enterUsernamePassword(ConfigReader.readProperty("QA_username"), ConfigReader.readProperty("QA_blankPassword"));

    }
    @Then("User cannot login and receives error message")
    public void user_cannot_login_and_receives_error_message() {

    }




}
