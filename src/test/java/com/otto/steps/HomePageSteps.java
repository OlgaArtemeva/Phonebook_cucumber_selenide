package com.otto.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.otto.pages.HomePage;
import com.otto.pages.LoginPage;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomePageSteps implements En {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    String baseURL = "https://www.otto.de/";


    public HomePageSteps() {
        Given("that we navigate to home page", () -> {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            WebDriverRunner.setWebDriver(driver);

            homePage = open(baseURL, HomePage.class);
        });

        When ("we accept cookies", () -> {
            homePage.acceptCookies();
        });

        When ("we press Main Konto icon", () -> {
            homePage.goToMeinKonto();
        });

        Then("user icon shows that we're logged in", () -> {
            homePage.verifyAuthIcon().shouldBe(Condition.visible);
        });

        Given("Login to existing account", () -> {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            WebDriverRunner.setWebDriver(driver);

            homePage = open(baseURL, HomePage.class);
            homePage.acceptCookies();
            homePage.goToMeinKonto();

            loginPage = page(LoginPage.class);
            loginPage.formIsShown().shouldHave(text("Deine Anmeldedaten"));
            loginPage.validAuth();
            loginPage.submit();

            homePage.verifyAuthIcon().shouldBe(Condition.visible);
        });

        When ("we select the damen category", () -> {
            homePage.goToDamenCategory();
        });

        And ("we close the driver", () -> {
            clearBrowserCookies();
            driver.quit();
        });
    }
}
