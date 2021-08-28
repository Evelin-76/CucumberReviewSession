Feature: different types of user should be able to login

#  Scenario: Driver should be able to login
#
#
#  Scenario: Salesmanager should be able to login
#
#
#  Scenario: Storemanager should be able to login

  Scenario Outline: Different user types
    Given the user is on the login page
    When  user logged in as "<userType>"
    Then the title should be "Dashboard"
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |