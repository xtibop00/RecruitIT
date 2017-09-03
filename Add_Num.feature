Feature: Add two numbers

Given I have two numbers
Scenario: Valid values
When I add two valid numbers
Then I should get positive answer
And status one

Scenario: Null values
When I add two null parameters
Then I should get null answer
And status zero


Scenario: Negative values
When I add two negative numbers
Then I should get negative answer
And status one

Scenario: non-numeric values
When I add non-numeric values
Then I should get bad result
