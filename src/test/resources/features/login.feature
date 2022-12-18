Feature: Login Test
  @wip
  Scenario: Login as a standart_user
    Given The user is on the login page
    When The user enters username "standard_user" and password "secret_sauce"
    Then The user verifies the header "Products"