Feature: To check Login functionality

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
    