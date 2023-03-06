package com.otto.steps;

import com.codeborne.selenide.Condition;
import com.otto.pages.DamenPage;
import com.otto.pages.HomePage;
import com.otto.pages.LoginPage;
import io.cucumber.java8.En;

import javax.annotation.meta.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class HomePageSteps implements En {
    HomePage homePage;
    LoginPage loginPage;

    String baseURL = "https://www.otto.de/";

    public HomePageSteps() {
        Given("that we navigate to home page", () -> {
            homePage = open(baseURL, HomePage.class);
        });

        When ("we accept cookies", () -> {
            homePage.acceptCookies();
        });

        When ("we press Main Konto icon", () -> {
            homePage.goToMeinKonto();
        });

        Then("Home page is loaded", () -> {
            homePage.verifyAuthIcon().shouldBe(Condition.visible);
        });

        Given("Login to existing account", () -> {
            homePage = open(baseURL, HomePage.class);
            homePage.acceptCookies();
            homePage.goToMeinKonto();
            homePage.verifyAuthIcon().shouldBe(Condition.visible);

            loginPage = page(LoginPage.class);
            loginPage.formIsShown().shouldHave(text("Deine Anmeldedaten"));
            loginPage.validAuth();
            loginPage.submit();
        });

        When ("we select the damen category", () -> {
            homePage.goToDamenCategory();
        });

    }
}
