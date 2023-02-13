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

    public void verifyTitleOfThePage(WebDriver driver, String title){
        Assert.assertEquals(BrowserUtils.getTitleWithJS(driver), title);
    }




}
