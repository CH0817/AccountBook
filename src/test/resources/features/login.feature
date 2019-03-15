Feature: User login

  Background:
    Given user is on the login page

  Scenario: User login success
    When user enter current username and password
    Then forward to main page

  Scenario: User login fail
    When user enter error username or password
    Then show message to user