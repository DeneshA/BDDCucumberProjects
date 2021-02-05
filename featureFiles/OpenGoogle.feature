Feature: This is to test Google search
  Scenario: Google search scenario
    Given User is entering Google.com
    When user is typing the search term "Lear Automation Online"
    And enters the return key
    Then the user should see the search results
