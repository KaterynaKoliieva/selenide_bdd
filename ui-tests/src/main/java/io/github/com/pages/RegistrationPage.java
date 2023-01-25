package io.github.com.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.WebPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage extends WebPage {

    public static SelenideElement emailField = $("#email-input"),
            firstNameButton = $("#firstName"),
            lastNameButton = $("#lastName"),
            postcodeButton = $("#contact-search-postcode"),
            findAddressButton = $(By.xpath("//button[contains(@class,'id-find-address-button')]")),
            retypePasswordButton = $("#retypePassword"),
            registerNowButton = $(By.xpath("//button[@class='btn btn--primary fill btn--xl']")),
            passwordButton = $("#password"),
            continueButton = $("#continueRegistrationButton"),
            addressForm = $("#addressSearchForm"),
            continueShoppingButton = $(By.xpath("//a[@class='btn btn--primary sm-fill btn--xl']"));
    public static ElementsCollection selectTitleButton = $$(By.xpath("//select[@id='newTitle']/option")),
            selectProfessionButton = $$(By.xpath("//select[@id='profession']/option")),
            selectAddressButton = $$(By.xpath("//select[contains(@id,'contact-address')]/option"));

}
