package io.github.com.pages;

import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.WebPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class LogInPage extends WebPage {

    public static SelenideElement loginForm= $("#form"),
            emailField= $("#email-existing"),
            passwordField = $("#password-field"),
            sighInButton = $("#sign-in-btn"),
            infoField = $(By.xpath("//div[@class='infobox__block']")),
            messageError = $(By.xpath("//p[@class='fm-item__message--error']")),
            logOutButton = $("#header_link_sign_out"),
            acceptCookiesButton = $(By.xpath("//a[@class='call']")),
            iframe = $(By.xpath("//iframe[@class='truste_popframe']")),
            registerNowButton = $(By.xpath("//button[contains(@class,'id-register-button')]"));


}
