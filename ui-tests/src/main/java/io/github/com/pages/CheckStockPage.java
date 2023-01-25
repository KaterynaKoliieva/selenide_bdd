package io.github.com.pages;

import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.WebPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CheckStockPage extends WebPage {

    public static SelenideElement findStoresField = $("#search_branch_textbox"),
            findStoresButton = $("#search_branch_button"),
            closeButton = $(By.xpath("//button[@class='lb-btn-cancel']")),
            addToBasketButton = $("#add_for_collection_button_1"),
            checkoutNowButton = $("#checkout_now_btn"),
            basketButton = $(By.xpath("//a[@href='/jsp/trolley/trolleyPage.jsp?reprice=true']"));

}
