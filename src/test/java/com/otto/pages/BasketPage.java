package com.otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private static By MeinWarenkorb = By.cssSelector("[data-qa='active']");
    private static By ProductInBasket = By.xpath("//div[@data-qa='itemgroup']/div/div/div/div[2]/div/div[1]/a");
    public static SelenideElement verifyBasketIsLoaded() {
        return $(MeinWarenkorb);
    }
    public SelenideElement verifyProductInBasket() {
        return $(ProductInBasket);
    }
}
