package com.base;

import com.BussinessLogics.BaseBL;
import com.BussinessLogics.HomeBL;
import org.openqa.selenium.WebDriver;

public class BLHolder {
    private static BLHolder INSTANCE = null;
    private static WebDriver driver;

    public BLHolder(WebDriver driver) {
        this.driver = driver;
    }

    public static BLHolder getInstance(WebDriver driver) {
        if (INSTANCE == null) {
            INSTANCE = new BLHolder(driver);
        }
        return INSTANCE;
    }

    public BaseBL getBaseBL() {
        return BaseBL.getInstance(driver);
    }

    public HomeBL getHomeBL() {
        return HomeBL.getInstance(driver);
    }
}
