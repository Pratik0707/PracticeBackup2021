Feature: To check Login functionality

  @Regression
  Scenario: To verify the login functionality of application2
    Given I am on login page of the application2
    When I Enter a valid2 <username>
    And I enter a valid2 <password>
    And I click on Login button2
    Then I Successfully login to the application2

 Examples: 
      | username | password |
      | pp       |    12345 | 