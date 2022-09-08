Feature: feature to login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page

    When enters username and password
    And click on login button
    Then user is navigated to home page
