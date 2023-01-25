package io.github.com.pages;

import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.WebPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends WebPage {

    public static SelenideElement successfullySignIn = $(By.xpath("//div[@class='text-center']")),
            yourAccountButton = $(By.xpath("//li[@class='acc']//span[@class='user-name']")),
            userNameLabel = $("#username-label"),
            signInButton = $(By.xpath("//span[@class='user-name']")),
            logOutButton = $("#header_link_sign_out"),
            searchField = $("#keyword-search"),
            searchButton = $(By.xpath("//button[@data-qaid='search-button']"));

}

