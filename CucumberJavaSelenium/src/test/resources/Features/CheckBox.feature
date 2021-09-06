@Intigration
Feature: Check single checkbox field

   @Regression @smoke @sanity
  Scenario: Check a checkbox field functionality
    Given I am on the home page
    When I click on Input forms dropdown
    And I select CheckBox demo option
    And I click on Click on this check box
    Then I can see a Success message
    
    
