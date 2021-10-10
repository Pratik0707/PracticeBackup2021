Feature: To check background functionality

  #background steps will be executed before every scenario execution
  #we can have single set of backgroud per feature file
  # we can add data tables in background as below

  Background: 
    Given user at login page
    When user enters Uname
      | Prt  |
      | Usr2 |
    And user enters Pwd
      | pwd1 |
      | pwd2 |
    Then user logs in

  Scenario: to verify hooks 1
    When user selects fill form
    Then a blank form opens

  Scenario: To verify hooks 2
    When user submits a form
    Then success message is displayed

