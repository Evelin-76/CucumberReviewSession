Feature: User should be able to login to Wytrack App
@login @wip
  Scenario: Driver shoud be able to login
    Given the user is on the login page
    When the user enters the driver information
    Then the user sould be able to login