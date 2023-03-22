package com.otto.steps;

import com.otto.pages.BasketPage;
import com.otto.pages.DamenPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class BasketPageSteps implements En {
    BasketPage basketPage;
    DamenPage damenPage;

    public BasketPageSteps() {
        Then("basket page is loaded", () -> {
            basketPage = page(BasketPage.class);
            basketPage.verifyBasketIsLoaded().shouldHave(text("Mein Warenkorb"));
        });
        And("product in basket", () -> {
            basketPage.verifyProductInBasket().shouldHave(text(damenPage.productName));
        });
    }
}

