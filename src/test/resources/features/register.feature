Feature: User register

  Background:
    Given user on the register page

  @register
  Scenario: The user register success
    When a user enter a not registered email and length 8 to 12 password
      | email           | password |
      | rex@mail.com    | 12345678 |
      | tester@mail.com | 1111111  |
    Then show "註冊成功" to user
    And store user information
    And forward to main page

  Scenario: The user enters an email was registered to causing register fail
    When a user enters registered email
    Then show message to user

  Scenario: The user enters a length of the password outside of 8 to 12 to causing register fail
    When a user enters a length of the password outside of 8 to 12
    Then show message to user