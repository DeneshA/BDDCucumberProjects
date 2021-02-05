Feature: This is the login feature for Orange HRM
  Scenario: This is login scenario
    Given user is on login page
    When  the user enters the valid username and password
    And click on the login button
    Then the user should be navigated to home page
