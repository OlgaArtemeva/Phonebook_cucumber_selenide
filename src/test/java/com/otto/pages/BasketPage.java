package com.otto.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private static By MeinWarenkorb = By.cssSelector("[data-qa='active']");
//    private static By ProductInBasket = By.cssSelector("//div[@data-qa='retailerBasketHeader']/following::div[1]/div/div/div/div[2]/div/div[1]/a");
    private static By ProductInBasket = By.xpath("//*[@id=\"basketItem1cdd0419-8e22-4188-b362-205ad6650f9b\"]/div/div/div[2]/div/div[1]/a");

    public static SelenideElement verifyBasketIsLoaded() {
        return $(MeinWarenkorb);
    }
    public static SelenideElement verifyProductInBasket() {
        return $(ProductInBasket);
    }
}
