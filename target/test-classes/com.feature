Feature: Testing the Login functionality

  Scenario: Happy Path login to the website
    Given User navigates to the NHS website
    When User enters username and password
    Then User click Sign in button and  successfully logged in
    And User verifies the title is NHS Patient


