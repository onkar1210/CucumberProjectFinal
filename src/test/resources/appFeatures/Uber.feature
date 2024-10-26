@All
Feature: Uber Booking Feature

  Scenario: Booking sedan
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point "Bangalore" and drop location "Nanded"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
  @Regression @Smoke
  Scenario: Booking SUV
    Given User wants to select a car type "SUV" from uber app
    When User selects car "SUV" and pick up point "Mumbai" and drop location "Akola"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 800 USD
  @Smoke
  Scenario: Booking cab
    Given User wants to select a car type "cab" from uber app
    When User selects car "cab" and pick up point "Parbhani" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 500 USD