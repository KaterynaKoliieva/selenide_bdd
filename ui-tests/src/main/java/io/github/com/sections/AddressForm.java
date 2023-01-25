package io.github.com.sections;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.Form;
import io.github.com.entities.Contacts;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddressForm extends Form<Contacts> {

    public static SelenideElement postcode = $("#contact-search-postcode"),
            findAddressButton = $(By.xpath("//button[contains(@class,'id-find-address-button')]"));

    public static ElementsCollection address = $$(By.xpath("//select[contains(@id,'contact-address')]/option"));

}
