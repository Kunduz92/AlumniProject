Feature: Validate the NHS homepage

  Scenario: Validate the NHS homepage after the user successfully logged in
    Given User navigates to the NHS website
    When User is successfully logged in
    Then User should see three cards about Patients with room, Patients waiting and Free rooms
    And User validates the numerical information about rooms
