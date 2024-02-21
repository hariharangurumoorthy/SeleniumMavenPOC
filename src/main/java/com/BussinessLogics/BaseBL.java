package com.BussinessLogics;

import org.openqa.selenium.WebDriver;

public class BaseBL {

    private static BaseBL baseBL;

    private WebDriver driver;

    public BaseBL(WebDriver driver){
        this.driver = driver;
    }

    public static BaseBL getInstance(WebDriver driver){
        if(baseBL==null){
            baseBL = new BaseBL(driver);
        }
        return baseBL;
    }

    public void loadSite(){
        driver.get("http://www.automationpractice.pl/");
    }
}
