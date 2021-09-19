@MapApi
Feature: Validating place APIs

@AddPlace
  Scenario Outline: Verify that place is being successfully added using AddPlaceAPI
    Given AddPlace payload with "<name>" "<language>" "<address>"
    When user calls "AddPlace API" with POST http request
    Then the API call is successfull with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"

    Examples: 
      | name     | language | address |
      | Pratik   | English  | Pune    |
      | Kaivalya | Marathi  | GNagar |
