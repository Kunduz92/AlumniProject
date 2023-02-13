package com.pages;

import com.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class NHSLoginPage {

    public NHSLoginPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#inputEmail")
    WebElement userName;

    @FindBy(css = "#inputPassword")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInBtn;

    public void enterUsernamePassword(String username, String passWord) throws InterruptedException {
        userName.sendKeys(username);
        password.sendKeys(passWord);
    }

    public void successSignIn(){
        signInBtn.click();
    }




}
