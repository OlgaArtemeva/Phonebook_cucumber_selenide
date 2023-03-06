package com.otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static By formHeader = By.cssSelector("[data-qa='user_login_form_headline']");
    public static By emailInput = By.cssSelector("[data-qa='user_login_email']");
    public static By passwordInput = By.cssSelector("[data-qa='user_login_password']");
    public static By buttonSubmit = By.cssSelector("[data-qa='user_dialog_submit_button']");

    public static String username = "olgaartemeva@duck.com";
    public static String password = "w2Yqn:-!MLCV63R";

//    private static By formHeader = By.cssSelector("[data-qa='user_login_form_headline']");
//    private static By emailInput = By.cssSelector("[data-qa='user_login_email']");
//    private static By passwordInput = By.cssSelector("[data-qa='user_login_password']");
//    private static By buttonSubmit = By.cssSelector("[data-qa='user_dialog_submit_button']");
//
//    private static String username = "olgaartemeva@duck.com";
//    private static String password = "w2Yqn:-!MLCV63R";

    public SelenideElement formIsShown() {
        return $(formHeader);
    }

    public void validAuth() {
        $(emailInput).val(username);
        $(passwordInput).val(password);

    }

    public void submit() {
        $(buttonSubmit).click();
    }
}
