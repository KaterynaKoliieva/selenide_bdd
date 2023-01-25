package io.github.com.sections;

import com.codeborne.selenide.SelenideElement;
import com.epam.jdi.light.elements.composite.Form;
import io.github.com.entities.User;

import static com.codeborne.selenide.Selenide.$;


public class LoginForm extends Form<User> {

    public static SelenideElement email = $("#email-existing"),
            password = $("#password-field"),
            signInButton = $("#sign-in-btn");

}
