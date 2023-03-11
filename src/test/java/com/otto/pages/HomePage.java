package com.otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class HomePage {
    private static By okCookiesButton = By.cssSelector("#cookieBanner > div > div > div.cookieBanner__footer > button");
    private static By meinKontoIcon = By.cssSelector("[data-qa='user_login_area_header_container']");
    private static By anmeldenButton = By.cssSelector("[data-qa='user_login_area_login']");  //???????? Element should be interactable {[data-qa='user_login_area_login']}
//    private static By anmeldenButton = By.cssSelector("[data-qa='user_dialog_submit_button']");  //???????? Element should be interactable {[data-qa='user_login_area_login']}
    private static By loggedInIcon = By.cssSelector("[data-qa='user_login_area_badge_logged_in']");
    private static By damenMode = By.cssSelector("#nav_menu > div > div > div > ul > li:nth-child(3) > a > span.nav_navi-elem__tile-title");
    public void acceptCookies() {
        $(okCookiesButton).click();
    }
    public void goToMeinKonto() {
        $(meinKontoIcon).click();
        $(anmeldenButton).click();
    }
    public SelenideElement verifyAuthIcon() {
        return $(loggedInIcon);
    }
    public void goToDamenCategory() {
        $(damenMode).click();
    }
}
