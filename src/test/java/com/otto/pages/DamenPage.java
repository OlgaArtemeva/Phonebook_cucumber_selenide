package com.otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.$;

public class DamenPage {
    WebDriver driver;
    private static By formHeader = By.cssSelector("#reptile-breadcrumb > div > div.nav_grimm-breadcrumb-container__title > div > div.nav_grimm-breadcrumb-headline__text-group > h1");
//    product - первый в списке из категории "Empfehlungen für dich"
    private static By product = By.xpath("//h2[contains(text(),'Empfehlungen für dich')]/following-sibling::div/ul/li[1]/a/div[2]/div[2]");
   public static String productName;
    private static By elementProductName = By.xpath("//h1[contains(text(), productName)]");

    private static By inDenWarenkorb = By.cssSelector("[data-qa='addToBasket']");
    private static By zumWarenkorb = By.xpath("//*[@id='p_layer__wrapper_0']/div/div/div/div[3]/div[4]/div[2]/a");
    public SelenideElement verifyDamenPage() {
        return $(formHeader);
    }
    public SelenideElement switchTo() {
        return $(product);
    }
    public void goToProduct() {
        {
            $(product).click();
        }
    }

    public SelenideElement verifyProductName() {
        return $(elementProductName);
    }

    public void addToBasket() {
        $(inDenWarenkorb).click();
    }

    public void goToBasket() {
        $(zumWarenkorb).click();
    }
}
