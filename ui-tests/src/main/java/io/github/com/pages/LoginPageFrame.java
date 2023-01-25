package io.github.com.pages;

import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.Section;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageFrame extends Section {

    public static SelenideElement acceptCookiesButton = $(By.xpath("//a[@class='call']")),
                    iframe = $(By.xpath("//iframe[@class='truste_popframe']"));

}
