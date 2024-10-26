Feature: Login feature
  Scenario Outline: Login fail - possible cobinations
    Given User is on application landing page
    When user clicks on sign in button
    Then user is displayed login screen
    When user enters "<Username>" in Username field
    And user enters "<Password>" in Password field
    And user clicks sign in button
    Then user gets login failed error message

    Examples:
      | Username          | Password          |
      | Incorrectusername | 123456            |
      | Onkarkahate       | Incorrectpassword |
      | Incorrectusername | Incorrectpassword |
