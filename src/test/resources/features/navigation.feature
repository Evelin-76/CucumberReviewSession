Feature: Navigation Menu
@wip
  Scenario: Navigating Fleet -- Vehicles
    Given  the user is on the login page
    And the user enters the sales "manager" with "password" information
    When the user navigates to "Fleet", "Vehicles"
    Then the title should be "Vehicles"