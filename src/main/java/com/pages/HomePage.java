package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private final By searchTextBox = By.id("gh-ac");
    private final By searchButton = By.id("gh-btn");
    private final By myEbayLink = By.cssSelector("li[id*=\"gh-eb-My\"] a");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getSearchTextBox() {
        return getElement(searchTextBox);
    }

    private WebElement getSearchButton() {
        return getElement(searchButton);
    }

    private WebElement getMyEbayLink() {
        return getElement(myEbayLink);
    }


    public SearchResultsPage userSearchesForABike(){
        getSearchTextBox().sendKeys("Bike");
        getSearchButton().click();
        return getInstance(SearchResultsPage.class);
    }

    public SignInPage clickOnMyEbayLink(){
        getMyEbayLink().click();
        return getInstance(SignInPage.class);
    }

}
