Feature: Validate the headers on the homepage

  Scenario: Validate the headers on the homepage
    Given User navigates to the NHS website
    When User enters username and password
    Then User click Sign in button
    And User is successfully logged in
    Then User should see table with No, Patients with Rooms, Room and Score
