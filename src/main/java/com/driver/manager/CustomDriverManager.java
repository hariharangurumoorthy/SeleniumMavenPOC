package com.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class CustomDriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver = new ChromeDriver();
    }
}
