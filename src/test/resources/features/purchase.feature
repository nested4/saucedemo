@wip2
Feature: Purchase E2E Test
  Background:
    Given The user is on the login page
    When The user enters username "standard_user" and password "secret_sauce"

  Scenario: Add items to the basket and purchase products
    When The user sort the products "Price (high to low)"
    And The user selects the cheapest item "6"
    And The user selects the cheapest item "2"
    And The user clicks the open the basket
    Then The user verifies the header "Your Cart"
    And The user checks out
    Then The user verifies the header "Checkout: Your Information"
    And The user enters name "ihsan", lastname "ozge" postal code "06200" and clicks
    Then The user verifies the header "Checkout: Overview"
    And The user clicks finish button
    Then The user verifies the header "Checkout: Complete!"
