package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {

    private final By firstSearchResultSection = By.cssSelector("ul[class*=\"srp-results\"] li[class*=\"s-item\"]:nth-child(2) a");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getFirstSearchResultSection() {
        return getElement(firstSearchResultSection);
    }

    public BikeDetailsPage userClicksOnTheFirstBikeDisplayedUnderTheSearchResultsSection(){
        getFirstSearchResultSection().click();
        return getInstance(BikeDetailsPage.class);
    }

}
