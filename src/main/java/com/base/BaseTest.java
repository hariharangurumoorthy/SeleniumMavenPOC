package com.base;

import com.driver.manager.CustomDriverManager;
import com.utils.selenium.PageUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected BLHolder blHolder;
    protected WebDriver driver;

    @BeforeTest
    public void setups() {
        driver = CustomDriverManager.getDriver();
    }

    @BeforeMethod
    public void initPageAndLogics() {
        blHolder = BLHolder.getInstance(driver);
        new PageUtils(driver);
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.close();
        }
    }
}
