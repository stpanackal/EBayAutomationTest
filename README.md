## Description:
Web Test Automation Suite for verifying both positive and negative user flows on Ebay Website.<br />
Positive flow involves searching for a bike and adding it to shopping cart and then verifying that the shopping cart has the selected bike details showing correctly on it.<br />
Negative flow involves verifying that an error message is shown to the user when the user clicks on My eBay link on the home page and then clicks on Continue button without providing any login credentials.

## Key Features:
1. End to End Tests designed in Page Object Model pattern
1. Screenshot Capture in case of test failures(can be accessed at test-output/screenshots Directory - have kept a sample from previous run for reference)
1. Screenshot Capture in case of test failures is also captured and embedded in the cucumber reports
1. Simple Cucumber Report can be accessed under test-output/cucumber-reports/cucumber-pretty/index.html - have kept a sample from previous run for reference showing all tests as passed
1. Detailed Cucumber Report can be accessed under test-output/cucumber-reports/advanced-reports/overview-features.html - have kept a sample from previous run for reference showing all tests as passed
 
 
## Instruction:
1. To trigger the test first please clone the repository and  thereafter navigate to the project directory.
 Please type in the below command and hit Enter to launch the tests:
 
   mvn clean install
 
