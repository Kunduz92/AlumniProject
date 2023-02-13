package com.steps;

import com.pages.NHSHomePage;
import com.pages.NHSLoginPage;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class NHSLoginStepDefinition {

    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsHomePage = new NHSLoginPage(driver);
    NHSHomePage homePage = new NHSHomePage(driver);

    @Given("User navigates to the NHS website")
    public void user_navigates_to_the_nhs_website() {
    driver.get(ConfigReader.readProperty("QA_nhs_url"));

    }
    @When("User enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        nhsHomePage.enterUsernamePassword(ConfigReader.readProperty("QA_username"), ConfigReader.readProperty("QA_password"));

    }
    @Then("User click Sign in button and  successfully logged in")
    public void user_click_sign_in_button_and_successfully_logged_in() {
        nhsHomePage.successSignIn();

    }

    @Then("User verifies the title is NHS Patient")
    public void user_verifies_the_title_is_nhs_patient() {
        homePage.verifyTitleOfThePage(driver, "NHS patients");

    }
}
