@Authentication
Feature: Authentication

  @LogInTest
  Scenario: Check the login of a registered user to the site
    Given check accept cookies button
    And check the login form with incorrect data
    And check the login form with empty password
    And check the login form with incorrect password
    And check the login form with email without asperand
    And check the login form with incorrect email
    And check the login form with empty email
    And check the login form with empty fields
    And submit login form with UserData
    Then User sees his "1660074366230cucumber 1660074366230cucumber" in the Account field

  @LogOutTest
   Scenario: Check the logout of the registered user from the site
    Given check accept cookies button
    And submit login form with UserData
    Given User clicks the Your Account Button
    When User clicks the log out button
    Then User checks is the "Sign in / Register" displayed







