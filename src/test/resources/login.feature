Feature: Testing the Login functionality

  Background: Navigating to HNS website
    Given User navigates to the NHS website

  Scenario: Happy Path login to the website
    When User enters username and password
    Then User click Sign in button
    And User is successfully logged in
    Then User verifies the title is NHS Patient


  Scenario: Negative testing of login functionality
    When User enters username and invalid password
    And User click Sign in button
    Then User cannot login



  Scenario: Negative testing of login functionality by passing blank password
    When User enters username and blank password
    And User click Sign in button
    Then User cannot login and receives error message









