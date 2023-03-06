Feature: login and auth,
  select a product category, a product and add it to the basket
#  Scenario: Login to existing account
#    Given that we navigate to home page
#    * we accept cookies
#    * we press Main Konto icon
#    Then wir see a login form
#    When we enter valid creds of existing user
#    And we submit this form
#    Then Home page is loaded
  Scenario: select a product category, a product and add it to the basket
    Given Login to existing account
    * we select the damen category
    Then wir see a damen page
#    * we select the product category
#    Then wir see a product form
#    When we enter on the button In den Warenkorb
#    And we select the button zum Warenkorb
#    Then basket page is loaded