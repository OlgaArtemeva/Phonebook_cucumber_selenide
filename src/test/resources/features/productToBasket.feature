Feature: login and auth,
  select a product category, a product and add it to the basket

  Scenario: select a product category, a product and add it to the basket
    Given Login to existing account
    * we select the damen category
    Then wir see a damen page
    * we select the first product from the category "Empfehlungen für dich"
    Then wir see a product form
    When we enter on the button In den Warenkorb
    And we select the button zum Warenkorb
    Then basket page is loaded
    And product in basket
    And we close the driver

