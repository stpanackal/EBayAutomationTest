$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EbayShopping.feature");
formatter.feature({
  "line": 1,
  "name": "Search for a bike on Ebay and add that to the shopping cart",
  "description": "",
  "id": "search-for-a-bike-on-ebay-and-add-that-to-the-shopping-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2604175122,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch the Ebay Website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I navigate to Ebay\u0027s Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.iNavigateToEbaySWebsite()"
});
formatter.result({
  "duration": 1955183909,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search for a bike on Ebay and validate that the bike selected by the user is displayed correctly in the shopping cart section",
  "description": "",
  "id": "search-for-a-bike-on-ebay-and-add-that-to-the-shopping-cart;search-for-a-bike-on-ebay-and-validate-that-the-bike-selected-by-the-user-is-displayed-correctly-in-the-shopping-cart-section",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I search for a bike",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I choose the first bike displayed in the search results",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add the bike to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see the selected bike under the shopping cart section",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iSearchForABike()"
});
formatter.result({
  "duration": 1909859378,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iChooseTheFirstBikeDisplayedInTheSearchResults()"
});
formatter.result({
  "duration": 6078640718,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iAddTheBikeToShoppingCart()"
});
formatter.result({
  "duration": 2968121178,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iShouldBeAbleToSeeTheSelectedBikeUnderTheShoppingCartSection()"
});
formatter.result({
  "duration": 637267921,
  "status": "passed"
});
formatter.after({
  "duration": 335786637,
  "status": "passed"
});
formatter.before({
  "duration": 2735379542,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch the Ebay Website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I navigate to Ebay\u0027s Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.iNavigateToEbaySWebsite()"
});
formatter.result({
  "duration": 1528598462,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should be shown the appropriate error message when the user clicks on Continue Button on MyEbay page without providing login credentials",
  "description": "",
  "id": "search-for-a-bike-on-ebay-and-add-that-to-the-shopping-cart;user-should-be-shown-the-appropriate-error-message-when-the-user-clicks-on-continue-button-on-myebay-page-without-providing-login-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I click on MyEbay link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on Continue button without providing login credentials",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see an error message on the page saying that the details provided does not match",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iClickOnMyEbayLink()"
});
formatter.result({
  "duration": 1750427217,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iClickOnContinueButtonWithoutProvidingLoginCredentials()"
});
formatter.result({
  "duration": 108889534,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iShouldBeAbleToSeeAnErrorMessageOnThePageSayingThatTheDetailsProvidedDoesNotMatch()"
});
formatter.result({
  "duration": 85153848,
  "status": "passed"
});
formatter.after({
  "duration": 141917774,
  "status": "passed"
});
});