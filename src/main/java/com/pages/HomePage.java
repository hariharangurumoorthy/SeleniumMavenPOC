package com.pages;

import com.utils.selenium.PageUtils;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignIn(){
        PageUtils.getElement(".login").click();
    }
}
