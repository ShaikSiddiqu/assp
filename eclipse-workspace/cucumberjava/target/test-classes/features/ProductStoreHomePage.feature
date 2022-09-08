Feature: feature to test Product Store to open home page functionality

  Scenario: validate Product Store to home page is working
    Given product store page1
    And user clicks on the home after login
    When hitts on home
    Then user is navigated to home page1
