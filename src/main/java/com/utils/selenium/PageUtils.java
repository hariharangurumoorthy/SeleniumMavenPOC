package com.utils.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageUtils {

    private static WebDriver driver;

    public PageUtils(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement getElement(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }

    public static List<WebElement> getElements(String selector) {
        List<WebElement> elements = driver.findElements(By.xpath(""));
        return elements;
    }
}
