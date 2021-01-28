package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class BikeDetailsPage extends BasePage {

    public static HashMap<String,String> bikeInformation = new HashMap<>();

    private final By bikeDescription = By.id("itemTitle");

    private final By bikeQuantity = By.id("qtyTextBox");

    private final By bikePrice = By.id("prcIsum");

    private final By addToCartButton = By.id("isCartBtn_btn");

    private final By noThanksProtectionPlanButton = By.cssSelector("div[class*=\"oly old\"] button[class*=\"close-button\"]");

    public BikeDetailsPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getAddToCartButton() {
        return getElement(addToCartButton);
    }

    private WebElement getNoThanksProtectionPlanButton() {
        return getElement(noThanksProtectionPlanButton);
    }


    public CheckOutPage userReviewsTheBikeDetailsAndAddsTheBikeToCart(){
        getBikeInformation();
        getAddToCartButton().click();
        getNoThanksProtectionPlanButton().click();
        return getInstance(CheckOutPage.class);
    }

    private void getBikeInformation(){
        bikeInformation.put("bikeDescription",getElementProperty(bikeDescription,"innerText").split(System.getProperty("line.separator"))[1]);
        bikeInformation.put("bikeQuantity",getElementProperty(bikeQuantity,"value"));
        bikeInformation.put("bikePrice",getElementProperty(bikePrice,"innerText"));
    }

}
