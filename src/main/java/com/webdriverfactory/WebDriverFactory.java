package com.webdriverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    public static WebDriver driver;

    synchronized public static WebDriver createInstance() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                return driver;
    }

}
