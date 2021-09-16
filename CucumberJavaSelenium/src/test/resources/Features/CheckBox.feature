@Intigration
Feature: Check single checkbox field

   @Regression @smoke @sanity
  Scenario: Check a checkbox field functionality
    Given I am on the home page
    When I click on Input forms dropdown
    And I select CheckBox demo option
    And I click on Click on this check box
    Then I can see a Success message
    
    @Regression
  Scenario: To verify the login functionality of application
    Given I am on login page of the application
    When I Enter a valid <username>
    And I enter a valid <password>
    And I click on Login button
    Then I Successfully login to the application

 Examples: 
      | username | password |
      | pp       |    12345 |
      | tt       |    12345 |
      | Demo2    |    12345 |   
