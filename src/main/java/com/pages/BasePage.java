package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getElement(By locator) {
        try{
            waitForElement(locator);
            return driver.findElement(locator);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getElementProperty(By locator, String property) {
        try{
            waitForElement(locator);
            return driver.findElement(locator).getAttribute(property);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
