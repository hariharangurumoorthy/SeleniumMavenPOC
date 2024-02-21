package com.BussinessLogics;

import com.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeBL {

    private static HomeBL homeBl = null;
    private WebDriver driver;
    protected HomePage homePage;

    public HomePage getHomePage() {
        return homePage;
    }

    protected HomeBL(WebDriver driver){
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    public static HomeBL getInstance(WebDriver driver){
        if(homeBl == null){
            homeBl = new HomeBL(driver);
        }
        return homeBl;
    }
}
