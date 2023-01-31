package io.github.com.pages;

import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.WebPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage extends WebPage {

    public static SelenideElement selectedDeliverButton = $("#trolley_page_move_item_to_delivery_906KV"),
            priceUnderHeadingField1 = $("#CPC_trolley_page_product_unit_price_1"),
            totalPriceField1 = $("#CPC_trolley_page_product_total_price_1"),
            priceUnderHeadingField2 = $("#trolley_page_product_unit_price_1"),
            totalPriceField2 = $("#trolley_page_product_total_price_1"),
            selectedClickAndCollectButton = $(By.xpath("//a[@id='CPC_trolley_page_move_item_to_collection_451GF']")),

            subTotalField = $("#trolley_page_product_total_goods"),
            deliveryField = $("#trolley_page_delivery"),
            totalField = $("#trolley_page_grand_total");
}
