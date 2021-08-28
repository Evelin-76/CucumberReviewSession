Feature: Calculator app should be able to calculation

  @calculator
  Scenario: Adding two numbers
    Given I have calculator app open
    When I add 5 to 7
    Then I should get 12

  Scenario: Adding two numbers
    Given I have calculator app open
    When I add 10 to 8
    Then I should get 18

  Scenario Outline: Adding two numbers <num1> with <num2> and expect <num3>
    Given I have calculator app open
    When I add <num1> to <num2>
    Then I should get <num3>

#    format for wind is control + alt + l or comand for mac
    Examples:
      | num1 | num2 | num3 |
      | 1    | 2    | 3    |
      | 11   | 2    | 15   |
      | 9    | 2    | 11   |
      | 12   | 21   | 33   |



