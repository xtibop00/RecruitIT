Feature: Add two numbers

Scenario: Valid values
Given I have a and b
When I add two valid numbers
Then I should get positive answer


Scenario: Whole number with fractional values
Given I have c and d
When I add two parameters
Then I should get the correct answer


Scenario: Negative values
Given I have e and f
When I add two negative numbers
Then I should get negative answer
