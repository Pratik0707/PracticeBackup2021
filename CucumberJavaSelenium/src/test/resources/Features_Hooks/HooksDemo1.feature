Feature: Test 1
  
  Scenario: to verify hooks 1
  Given user at login page
  When user enters Uname
  And user enters Pwd
  Then user logs in

tags={"@smoke and @regression"} # can also be like: tags={"(@smoke or @regression) and not @integration"}
  Scenario: To verify hooks 2
  Given user at home page
  When user clicks on dropdown
  And users opens a form
  Then user fills a form
  
  