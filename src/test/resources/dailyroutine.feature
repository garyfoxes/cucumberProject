#This is a sample test using example tables
Feature: Employee
  As a tester I would like to make sure cucumber works on my machine

  Scenario Outline: Test State
    Given I work in latenights
    When I meet "<name>"

    Examples: People
      | name       |
      | watchmen   |
      | shop clerk |

    Scenario: Meet John
    Given I work in latenights
    When I meet "John"
    Then he drives his car

