package com.steps;

import com.utils.UtilConstants;
import com.webdriverfactory.WebDriverFactory;
import com.webdriverfactory.WebDriverManager;
import com.pages.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import static com.utils.WebDriverUtils.embedScreenshotToReport;
import static com.utils.WebDriverUtils.takeScreenShot;


public class StepDefinition {

    Page page;

    @Before
    public void setUp() {
        WebDriver driver = WebDriverFactory.createInstance();
        WebDriverManager.setWebDriver(driver);
        page = new BasePage(WebDriverManager.getDriver());
    }


    @Given("^I navigate to Ebay's Website$")
    public void iNavigateToEbaySWebsite() {
        WebDriverManager.getDriver().get(UtilConstants.getEBayHomePageUrl());
        WebDriverManager.getDriver().manage().window().fullscreen();
    }

    @When("^I search for a bike$")
    public void iSearchForABike() {
        page.getInstance(HomePage.class).userSearchesForABike();
    }

    @And("^I choose the first bike displayed in the search results$")
    public void iChooseTheFirstBikeDisplayedInTheSearchResults() {
        page.getInstance(SearchResultsPage.class).userClicksOnTheFirstBikeDisplayedUnderTheSearchResultsSection();
    }

    @And("^I add the bike to shopping cart$")
    public void iAddTheBikeToShoppingCart() {
        page.getInstance(BikeDetailsPage.class).userReviewsTheBikeDetailsAndAddsTheBikeToCart();
    }

    @Then("^I should be able to see the selected bike under the shopping cart section$")
    public void iShouldBeAbleToSeeTheSelectedBikeUnderTheShoppingCartSection() {
        page.getInstance(CheckOutPage.class).verifyThatTheBikeDetailsMatchWithTheBikeThatTheUserHadSelected();
    }


    @When("^I click on MyEbay link$")
    public void iClickOnMyEbayLink() {
        page.getInstance(HomePage.class).clickOnMyEbayLink();
    }

    @And("^I click on Continue button without providing login credentials$")
    public void iClickOnContinueButtonWithoutProvidingLoginCredentials() {
        page.getInstance(SignInPage.class).userClicksOnContinueButtonWithoutProvidingLoginCredentials();
    }

    @Then("^I should be able to see an error message on the page saying that the details provided does not match$")
    public void iShouldBeAbleToSeeAnErrorMessageOnThePageSayingThatTheDetailsProvidedDoesNotMatch() {
        page.getInstance(SignInPage.class).verifyThatTheUserIsShownTheCorrectErrorMessage();
    }


    @After
    public  void tearDown(Scenario scenario) {
        WebDriver driver = WebDriverManager.getDriver();
        if(scenario.isFailed()){
            takeScreenShot(scenario,driver);
            embedScreenshotToReport(scenario, driver);
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
