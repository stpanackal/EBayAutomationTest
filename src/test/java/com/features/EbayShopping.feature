Feature: Search for a bike on Ebay and add that to the shopping cart

  Background: Launch the Ebay Website
    Given I navigate to Ebay's Website

  Scenario: Search for a bike on Ebay and validate that the bike selected by the user is displayed correctly in the shopping cart section
    When I search for a bike
    And I choose the first bike displayed in the search results
    And I add the bike to shopping cart
    Then I should be able to see the selected bike under the shopping cart section


  Scenario: User should be shown the appropriate error message when the user clicks on Continue Button on MyEbay page without providing login credentials
    When I click on MyEbay link
    And I click on Continue button without providing login credentials
    Then I should be able to see an error message on the page saying that the details provided does not match