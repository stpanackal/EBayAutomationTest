package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.pages.BikeDetailsPage.bikeInformation;

public class CheckOutPage extends BasePage {

    private final By bikeDescription = By.cssSelector("h3[class*=\"item-title\"] span span");

    private final By bikeQuantity = By.cssSelector("select[data-test-id*=\"qty-dropdown\"] option:nth-child(1)");

    private final By bikePrice = By.cssSelector("div[class*=\"item-price\"] span");

    private final By checkOutIcon = By.id("gh-cart-n");

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }


    public void verifyThatTheBikeDetailsMatchWithTheBikeThatTheUserHadSelected(){
        Assert.assertEquals(getElementProperty(bikeDescription,"innerText"),bikeInformation.get("bikeDescription"));
        Assert.assertEquals(getElementProperty(bikeQuantity,"innerText"),bikeInformation.get("bikeQuantity"));
        Assert.assertEquals(getElementProperty(bikePrice,"innerText"),bikeInformation.get("bikePrice"));
        Assert.assertEquals(Integer.parseInt(getElementProperty(checkOutIcon,"innerText")),1);
    }


}
