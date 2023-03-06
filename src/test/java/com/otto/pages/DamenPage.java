package com.otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DamenPage {

    private static By formHeader = By.cssSelector("#reptile-breadcrumb > div > div.nav_grimm-breadcrumb-container__title > div > div.nav_grimm-breadcrumb-headline__text-group > h1");

    public SelenideElement verifyDamenPage() {
        return $(formHeader);
    }

}
