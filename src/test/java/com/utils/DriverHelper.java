package com.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverHelper {

    public static WebDriver driver;

    private DriverHelper(){ } // ->constructor, because I don't want anyone to create an object from this class


    public static WebDriver getDriver(){
        if(driver == null || ((RemoteWebDriver)driver).getSessionId() == null){
            switch (ConfigReader.readProperty("browser")){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
        }
        return driver;
    }



}
