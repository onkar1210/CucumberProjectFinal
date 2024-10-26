Feature: Order food from swiggy
  Scenario: Search a food item
    Given I have food search field on page
    When I search "Rajama chawal"
    Then All the "Rajama chawal" optins are listed

  Scenario: Search a Restaurant
    Given I have a restaurant search field on Page
    When I search "Taj Hotel" restaurant
    Then "Taj Hotel" restaurant is displayed
    But If no hotel with matching name with "Taj Hotel" listed on swiggy
    Then "Could not find your restaurant" should be displayed