Feature: to open home page functionality

  Scenario: Validate is working
    Given I have a browser opened and url is navigated
    When home page1 is viewed
    And product list should be appear pertaining to the home page1 product
    Then check more outcomes
