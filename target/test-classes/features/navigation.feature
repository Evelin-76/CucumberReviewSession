Feature: Navigation Menu

  Scenario: Navigating Fleet -- Vehicles
    Given  the user is on the login page
    And the user enters the sales "User1" with "UserUser123" information
    When the user navigates to "Fleet", "Vehicles"
    Then the title should be "Vehicles"