package io.github.com.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.WebPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage extends WebPage {

    public static SelenideElement //deliverButton = $("#product_add_button_906KV"),
            continueShoppingButton = $("#continue_button_btn"),
           // clickAndCollectButton = $("#add_for_collection_button_451GF"),
            headerNames = $(By.xpath("//h3[@class='lii__title']"));


    public static ElementsCollection deliverButton = $$(By.xpath("//button[@class='DtE_nS UvZo21 Q_KHB7 bTqDYN']")),
            clickAndCollectButton = $$(By.xpath("//button[@class='DtE_nS UvZo21 Q_KHB7 a3MLfX']"));

}
