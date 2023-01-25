@Purchases
Feature: Purchases

  Background: Registration of a new user
    Given check accept cookies button
    When click the Register now button
    And enter email in the Email Address field
    And click on the Continue button
    And choose Title
    And enter first name in the First Name field
    And enter last name in the Last Name field
    And choose Profession
    And enter Postcode
    And select Address
    And enter password and retypes it in the Password and Re-type Password fields
    And click on the Register now button
    Then click the Continue Shopping button

   @RegistrationTest
   Scenario: Check the registration of a new user
     Then User sees "Cucumber Onion" in the Account field

    @ShoppingCartTest
    Scenario: Check the shopping cart
      Given enter the "drills" of the product in the search field
      And click the Deliver button for the desired first product
      And click the Click and Collect button for the desired second product
      And enter the "BA22 8RT" in the Find Stores Field
      And find a suitable store
      And click the Basket button
      And check if the Delivery button is selected for the first product
      And check if the Click And Collect button is selected for the second product
      And check Sub Total Field
      And check the "FREE" of the Delivery Field
      And User checks if the Total Field is the same as the Sub Total Field




