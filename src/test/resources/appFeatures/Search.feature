Feature: Amazon search
  Scenario: Search prodect
    Given I have a search field on amazon page
    When I search a product with name "Apple MacBook Pro" and price 1000
    Then Prodect with name "Apple MacBook Pro" should be  displayed