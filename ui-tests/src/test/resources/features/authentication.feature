@Authentication
Feature: Authentication

  Background: Login to the site
    Given check accept cookies button
    And submit login form with UserData

  @LogInTest
  Scenario: Check the login of a registered user to the site
    Then User sees his "1660074366230cucumber 1660074366230cucumber" in the Account field

  @LogOutTest
   Scenario: Check the logout of the registered user from the site
    Given User clicks the Your Account Button
    When User clicks the log out button
    Then User checks is the "Sign in / Register" displayed







