Feature: feature to test login functionality

@positive
Scenario Outline: Check login is successfull
Given I am on Login page
When I enters valid credentials
And I click on login button
Then I am logged in successfull



