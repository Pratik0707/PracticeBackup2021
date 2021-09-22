Feature: To check Login functionality

  @Regression
  Scenario: To verify the login functionality of application
    Given I am on login page of the application
    When I Enter credentials
      | tt  | 12345 |
      | tt2 | 77389 |
    And I click on Login button
    Then I Successfully login to the application
