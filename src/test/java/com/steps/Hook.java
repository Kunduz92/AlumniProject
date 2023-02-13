package com.steps;

import com.utils.BrowserUtils;
import com.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hook {

    public WebDriver driver;

    @Before
    public void setup(){
        driver = DriverHelper.getDriver(); //utils
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        BrowserUtils.getScreenShot(driver, "NHS");
//        driver.quit();
    }
}
