@txn
Feature: User register

  Background:
    Given user on the register page

  Scenario Outline: The user register success
    When user enter "<email>" and "<password>" to register
    Then forward to main page
    Examples:
      | email           | password |
      | rex@mail.com    | 12345678 |
      | tester@mail.com | 1111111  |

  Scenario: The user enters an email was registered to causing register fail
    When a user enters registered email
    Then show message to user

  Scenario: The user enters a length of the password outside of 8 to 12 to causing register fail
    When a user enters a length of the password outside of 8 to 12
    Then show message to user