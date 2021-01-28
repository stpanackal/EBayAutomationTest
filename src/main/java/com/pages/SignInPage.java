package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPage extends BasePage{

    private final By continueButton = By.id("signin-continue-btn");
    private final By signInErrorMessage = By.id("signin-error-msg");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getContinueButton() {
        return getElement(continueButton);
    }


    public void userClicksOnContinueButtonWithoutProvidingLoginCredentials(){
        getContinueButton().click();
    }


    public void verifyThatTheUserIsShownTheCorrectErrorMessage(){
        Assert.assertEquals(getElementProperty(signInErrorMessage,"innerText"),"Oops, that's not a match.");
    }

}
