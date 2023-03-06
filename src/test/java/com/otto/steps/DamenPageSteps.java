package com.otto.steps;

import com.codeborne.selenide.Condition;
import com.otto.pages.DamenPage;
import io.cucumber.java8.En;

public class DamenPageSteps implements En {
    DamenPage damenPage;

    public DamenPageSteps() {
        Then("wir see a damen page", () -> {
            damenPage.verifyDamenPage().shouldBe(Condition.visible);
        });
    }
}
