package com.otto.steps;

import com.otto.pages.BasketPage;
import com.otto.pages.DamenPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class BasketPageSteps implements En {
    BasketPage basketPage;
//    DamenPageSteps damenPageSteps;

//    String b = "LBF Trolleyset »Hartschalen-Handgepäck Koffer 3-teiliges Set M/L/XL«, 4 Rollen, (Set, 3 tlg), mit TSA-Schloss und Universalrad Erweiterbar Seitengriff grau";
    public BasketPageSteps() {
        Then("basket page is loaded", () -> {
            basketPage = page(BasketPage.class);
            basketPage.verifyBasketIsLoaded().shouldHave(text("Mein Warenkorb"));
        });
        And("product in basket", () -> {


//            basketPage.verifyProductInBasket().shouldHave(text("" + damenPageSteps.a + "")); // не работает
//            damenPageSteps = page(DamenPageSteps.class);
            basketPage.verifyProductInBasket().shouldHave(text(damenPageSteps.a));
//            basketPage.verifyProductInBasket().shouldHave(text(b)); // работает
//            basketPage.verifyProductInBasket().shouldHave(text("LASCANA Slip-On Sneaker aus Textil VEGAN"));
//            basketPage.verifyProductInBasket().shouldHave(text("LBF Trolleyset »Hartschalen-Handgepäck Koffer 3-teiliges Set M/L/XL«, 4 Rollen, (Set, 3 tlg), mit TSA-Schloss und Universalrad Erweiterbar Seitengriff grau"));
        });
    }
}
