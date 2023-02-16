package com.pages;

import com.utils.BrowserUtils;
import com.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class NHSHomePage {

    public NHSHomePage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10), this);
    }

    @FindBy(xpath = "//div[contains(text(),'Patients with rooms')]//preceding-sibling::div")
    WebElement patientsWithRooms;

    @FindBy(xpath = "//div[contains(text(),'Patients waiting')]//preceding-sibling::div")
    WebElement patientsWaiting;

    @FindBy(xpath = "//div[contains(text(),'Free rooms')]//preceding-sibling::div")
    WebElement freeRooms;

    @FindBy(xpath = "//div[@id='patients-with-rooms-live']")
    WebElement numberOfOccupiedRooms;

    @FindBy(css = "#patients-waiting-live")
    WebElement numberOfWaitingPatients;

    @FindBy(css = "#free-rooms-live")
    WebElement numberOfFreeRooms;

    public void verifyText(String patientWithRoom, String waitingPatients, String freeRoom){
        Assert.assertEquals(patientsWithRooms.getText(), patientWithRoom);
        Assert.assertEquals(patientsWaiting.getText(), waitingPatients);
        Assert.assertEquals(freeRooms.getText(), freeRoom);

    }

    public void verifyNumberOfRooms(String numOfTakenRooms, String numWaitingPatients, String numFreeRooms){
        Assert.assertEquals(numberOfOccupiedRooms.getText(), numOfTakenRooms);
        Assert.assertEquals(numberOfWaitingPatients.getText(), numWaitingPatients);
        Assert.assertEquals(numberOfFreeRooms.getText(), numFreeRooms);

    }









    public void verifyTitleOfThePage(WebDriver driver, String title){
        Assert.assertEquals(BrowserUtils.getTitleWithJS(driver), title);
    }




}
