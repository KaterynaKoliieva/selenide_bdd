package cucumberTests.stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.com.entities.Users;
import io.github.com.pages.ProductPage;
import io.github.com.pages.RegistrationPage;
import io.qameta.allure.Allure;
import org.openqa.selenium.NoSuchElementException;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static io.github.com.entities.Users.*;
import static io.github.com.pages.BasketPage.*;
import static io.github.com.pages.CheckStockPage.*;
import static io.github.com.pages.HomePage.logOutButton;
import static io.github.com.pages.HomePage.*;
import static io.github.com.pages.LogInPage.emailField;
import static io.github.com.pages.LogInPage.registerNowButton;
import static io.github.com.pages.LogInPage.*;
import static io.github.com.pages.LoginPageFrame.acceptCookiesButton;
import static io.github.com.pages.LoginPageFrame.iframe;
import static io.github.com.pages.ProductPage.clickAndCollectButton;
import static io.github.com.pages.ProductPage.deliverButton;
import static io.github.com.pages.RegistrationPage.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserStepdefs {

    @Before
    public void setUp() {
        Configuration.startMaximized = true;
        open("https://www.screwfix.com/login/");
        logger.toLog("Run Tests");
    }

    @And("^input random email in email field$")
    public void iInputRandomNameIn() {
        String email = Users.randomEmail();
        Allure.addAttachment("Email: ", email);
        emailField.sendKeys(email);
        //input(Users.randomEmail()).input(value);
    }

    @And("^User checks if the Delivery button is selected for the first product$")
    public void userChecksIfTheDeliveryButtonIsSelectedForTheProduct() {
        assertTrue(selectedDeliverButton.isEnabled());
    }

    @And("^User checks if the Click And Collect button is selected for the second product$")
    public void userChecksIfTheClickAndCollectButtonIsSelectedForTheSecondProduct() {
        assertTrue(selectedClickAndCollectButton.isEnabled());
    }

    @And("^User checks Sub Total Field$")
    public void userChecksSubTotalField() {
        double firstPrice = Double.parseDouble(totalPriceField1.getText().replace("£", ""));
        double secondPrice = Double.parseDouble(totalPriceField2.getText().replace("£", ""));
        String res_st = String.format(Locale.US, "%.2f", firstPrice+secondPrice);

        assertEquals(Double.parseDouble(subTotalField.getText().replace("£", "")),
                Double.parseDouble(res_st), 0.00);
    }

    @And("^input random email$")
    public void inputRandomEmail() {
        String email = randomEmail();
        Allure.addAttachment("Email: ", email);
        emailField.sendKeys(email);
    }

    @And("^check accept cookies button$")
    public void checkAcceptCookiesButton() {
        sleep(1000);
        try{
            if(iframe.isDisplayed()){
                switchTo().defaultContent();
                switchTo().frame(iframe);
                acceptCookiesButton.click();
                switchTo().defaultContent();
            }
        } catch (NoSuchElementException e){}
        sleep(2000);
    }

    @And("^submit login form with UserData$")
    public void submitLoginFormWithUserData() {
        emailField.click();
        emailField.sendKeys(DEFAULT_USER.email);
        passwordField.click();
        passwordField.sendKeys(DEFAULT_USER.password);
        sighInButton.click();
    }

    @Then("^User sees his \"([^\"]*)\" in the Account field$")
    public void userSeesHisInTheAccountField(final String fullName) {
        sleep(2000);
        signInButton.shouldHave(Condition.text(fullName));
    }

    @Given("^User clicks the Your Account Button$")
    public void userClicksTheYourAccountButton() {
        yourAccountButton.click();
    }

    @When("^User clicks the log out button$")
    public void userClicksTheLogOutButton() {
        logOutButton.click();
    }

    @Then("^User checks is the \"([^\"]*)\" displayed$")
    public void userChecksIsTheDisplayed(final String signInText) {
        yourAccountButton.shouldHave(Condition.text(signInText));
    }

    @Given("^open login page$")
    public void openLoginPage() {
        open("https://www.screwfix.com/login/");
    }

    @When("^click the Register now button$")
    public void clickTheRegisterNowButton() {
        registerNowButton.click();
    }

    @And("^enter email in the Email Address field$")
    public void enterEmailInTheEmailAddressField() {
        RegistrationPage.emailField.click();
        RegistrationPage.emailField.sendKeys(randomEmail());
    }

    @And("^click on the Continue button$")
    public void clickOnTheContinueButton() {
        continueButton.click();
    }

    @And("^enter first name in the First Name field$")
    public void enterFirstNameInTheFirstNameField() {
        firstNameButton.click();
        firstNameButton.sendKeys(DEFAULT_USER.firstName);
    }

    @And("^enter last name in the Last Name field$")
    public void enterLastNameInTheLastNameField() {
        lastNameButton.click();
        lastNameButton.sendKeys(DEFAULT_USER.lastName);
    }

    @And("^enter Postcode$")
    public void enterPostcode() {
        postcodeButton.click();
        postcodeButton.sendKeys(defaultPostcode);
        sleep(1000);
        findAddressButton.click();
    }

    @And("^choose Title$")
    public void chooseTitle() {
        sleep(2000);
        int rndNumber = randomNumber(selectTitleButton.size());
        sleep(2000);
        selectTitleButton.get(rndNumber).click();
    }

    @And("^choose Profession$")
    public void chooseProfession() {
        sleep(2000);
        int rndNumber = randomNumber(selectProfessionButton.size());
        sleep(2000);
        selectProfessionButton.get(rndNumber).click();
    }

    @And("^select Address$")
    public void selectAddress(){
        sleep(2000);
        int rndNumber = randomNumber(selectAddressButton.size());
        sleep(2000);
        selectAddressButton.get(rndNumber).click();
    }

    @And("^enter password and retypes it in the Password and Re-type Password fields$")
    public void enterPasswordAndRetypesItInThePasswordAndReTypePasswordFields() {
        String password = randomPassword;
        passwordButton.click();
        passwordButton.sendKeys(password);
        retypePasswordButton.click();
        retypePasswordButton.sendKeys(password);
        sleep(2000);
    }

    @And("^click on the Register now button$")
    public void clickOnTheRegisterNowButton() {
        RegistrationPage.registerNowButton.click();
    }

    @Then("^click the Continue Shopping button$")
    public void clickTheContinueShoppingButton() {
        sleep(1000);
        continueShoppingButton.click();
    }

    @Then("^User sees \"([^\"]*)\" in the Account field$")
    public void userSeesInTheAccountField(final String fullName) {
        userNameLabel.shouldHave(Condition.text(fullName));
    }

    @Given("^enter the \"([^\"]*)\" of the product in the search field$")
    public void enterTheOfTheProductInTheSearchField(final String text){
        sleep(1000);
        searchField.click();
        sleep(1000);
        searchField.sendKeys(text);
        searchButton.click();
    }

    @And("^click the Deliver button for the desired first product$")
    public void clickTheDeliverButtonForTheDesiredFirstProduct() {
        sleep(2000);
        deliverButton.get(0).click();
        //if(ProductPage.continueShoppingButton.isDisplayed())
            ProductPage.continueShoppingButton.click();
    }

    @And("^click the Click and Collect button for the desired second product$")
    public void clickTheClickAndCollectButtonForTheDesiredSecondProduct() {
        sleep(1000);
        clickAndCollectButton.get(1).click();
    }

    @And("^enter the \"([^\"]*)\" in the Find Stores Field$")
    public void enterTheInTheFindStoresField(final String postcode) {
        findStoresField.click();
        findStoresField.sendKeys(postcode);
        findStoresButton.click();
    }

    @And("^find a suitable store$")
    public void findASuitableStore() {
        sleep(2000);
        addToBasketButton.click();
        sleep(2000);
        closeButton.click();
    }

    @And("^click the Basket button$")
    public void clickTheBasketButton() {
        //checkoutNowButton.click();
        basketButton.click();
    }

    @And("^check if the Delivery button is selected for the first product$")
    public void checkIfTheDeliveryButtonIsSelectedForTheFirstProduct() {
        sleep(2000);
        selectedDeliverButton.shouldBe(Condition.enabled);
    }

    @And("^check if the Click And Collect button is selected for the second product$")
    public void checkIfTheClickAndCollectButtonIsSelectedForTheSecondProduct() {
        sleep(1000);
        selectedClickAndCollectButton.shouldBe(Condition.enabled);
    }

    @And("^check Sub Total Field$")
    public void checkSubTotalField() {
        sleep(2000);
        double firstPrice = Double.parseDouble(totalPriceField1.getText().replace("£", ""));
        double secondPrice = Double.parseDouble(totalPriceField2.getText().replace("£", ""));
        String res_st = String.format(Locale.US, "%.2f", firstPrice+secondPrice);

        assertEquals(Double.parseDouble(subTotalField.getText().replace("£", "")),
                Double.parseDouble(res_st), 0.00);
    }

    @And("^check the \"([^\"]*)\" of the Delivery Field$")
    public void checkTheOfTheDeliveryField(final String text) {
        sleep(2000);
        deliveryField.shouldHave(Condition.text(text));
    }

    @And("^User checks if the Total Field is the same as the Sub Total Field$")
    public void userChecksIfTheTotalFieldIsTheSameAsTheSubTotalField() {
        sleep(2000);
        assertEquals(Double.parseDouble(totalField.getText().replace("£", "")),
                Double.parseDouble(subTotalField.getText().replace("£", "")), 0.00);
    }

    @After
    public void tearDown() {
        Selenide.close();
    }

}