#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#*** IMP : we can mention @ anotation here for entire feature as well
Feature: Check single input field

  @Regression
  Scenario: Check Enter message text box
    Given I am on home page
    When I click on Input form dorpdown
    And I select Simple form demo option
    And I enter a message in Enter message text box
    And I click on Show message button
    Then Entered message is displayed as Your Message

  Scenario Outline: Check Enter message text box
    Given I am on home page
    When I click on Input form dorpdown
    And I select Simple form demo option
    And I enter a <message> in Enter message text box
    And I click on Show message button
    Then <Entered-message> is displayed as Your Message

    Examples: 
      | message | Entered-message |
      | Hello   | Hello           |
      | Demo1   | Demo1           |
      | Demo2   | Demo2           |

    
