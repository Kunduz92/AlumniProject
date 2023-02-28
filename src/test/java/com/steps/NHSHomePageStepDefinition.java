package com.steps;

import com.pages.NHSHomePage;
import com.pages.NHSLoginPage;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class NHSHomePageStepDefinition {


    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage nhsLoginPage = new NHSLoginPage(driver);
    NHSHomePage nhsHomePage = new NHSHomePage(driver);



    @Then("User should see three cards about Patients with room, Patients waiting and Free rooms")
    public void user_should_see_three_cards_about_patients_with_room_patients_waiting_and_free_rooms() {
        nhsHomePage.verifyText("Patients with rooms", "Patients waiting", "Free rooms");

    }

    @Then("User validates the numerical information about rooms")
    public void user_validates_the_numerical_information_about_rooms() {
        nhsHomePage.verifyNumberOfRooms("3", "3", "0");

    }
}
