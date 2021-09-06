Feature: To check background functionality
#background steps will be executed before every scenario execution

  Background: 
    Given user at login page
    When user enters Uname
    And user enters Pwd
    Then user logs in

  Scenario: to verify hooks 1
    When user selects fill form
    Then a blank form opens

  Scenario: To verify hooks 2
    When user submits a form
    Then success message is displayed
