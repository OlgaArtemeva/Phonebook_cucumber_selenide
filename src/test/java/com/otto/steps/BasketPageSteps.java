package com.otto.steps;

import com.otto.pages.BasketPage;
import com.otto.pages.DamenPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;

public class BasketPageSteps implements En {

    public BasketPageSteps() {
        Then("basket page is loaded", () -> {
            BasketPage.verifyBasketIsLoaded().shouldHave(text("Mein Warenkorb"));
        });
        And("product in basket", () -> {
//            BasketPage.verifyProductInBasket().shouldHave(text(damenPage.productName));
            BasketPage.verifyProductInBasket().shouldHave(text("LASCANA Slip-On Sneaker aus Textil VEGAN"));
        });
    }
}
