package com.otto.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private static By MeinWarenkorb = By.cssSelector("[data-qa='active']");
//    private static By ProductInBasket = By.cssSelector("//div[@data-qa='retailerBasketHeader']/following::div[1]/div/div/div/div[2]/div/div[1]/a");
   // поменять xpath на универсальный
//    private static By ProductInBasket = By.xpath("//*[@id=\"basketItem9332a63c-33a7-4e9f-9c92-7d9ad048cc03\"]/div/div/div[2]/div/div[1]");
    private static By ProductInBasket = By.xpath("//*[@id='basketItem418e14de-c561-4bf8-9c9e-c4c61899e564']/div/div/div[2]/div/div[1]/a");
    public static SelenideElement verifyBasketIsLoaded() {
        return $(MeinWarenkorb);
    }
//    public static SelenideElement verifyProductInBasket() {
//        return $(ProductInBasket);
//    }
    public SelenideElement verifyProductInBasket() {
        return $(ProductInBasket);
    }
}
