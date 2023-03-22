package com.otto.steps;

import com.codeborne.selenide.Condition;
import com.otto.pages.DamenPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;

public class DamenPageSteps implements En {
    DamenPage damenPage;


    public DamenPageSteps() {
        Then("wir see a damen page", () -> {
            damenPage = page(DamenPage.class);
            damenPage.verifyDamenPage().shouldBe(Condition.visible);
        });

        When("we select the first product from the category \"Empfehlungen für dich\"", () -> {
            damenPage.productName = damenPage.switchTo().getText();
            damenPage.goToProduct();
        });

        Then("wir see a product form", () -> {
            damenPage.verifyProductName().shouldBe(Condition.visible);
        });

        When("we enter on the button In den Warenkorb", () -> {
            damenPage.addToBasket();

        });

        And("we select the button zum Warenkorb", () -> {
            damenPage.goToBasket();
        });

    }
}
