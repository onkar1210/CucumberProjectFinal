Feature: User Registration
  Scenario: user registration with different data
    Given User is on registration page
    When User enters following details
      | Onkar   | Kahate     | onk1210@gmail.com   | 789456 | Pune     |
      | Durgesh | Chandajkar | dugu4356@gmail.com  | 123456 | Parbhani |
      | Balaji  | talde      | balya7586@gmail.com | 963258 | Akola    |
    Then user registration should be successful

  Scenario: user registration with different data with column
    Given User is on registration page
    When User enters following details with column
      | Fisrstname | Lastname   | Email               | MobileNumber | City     |
      | Onkar      | Kahate     | onk1210@gmail.com   | 789456       | Pune     |
      | Durgesh    | Chandajkar | dugu4356@gmail.com  | 123456       | Parbhani |
      | Balaji     | talde      | balya7586@gmail.com | 963258       | Akola    |
    Then user registration should be successful