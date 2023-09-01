@Smoke
Feature: Retail Acount Page

  Background: 
    Given User is on retail website homepage
    When User click on Sign in option
    And User enter email 'omar.zammani@gmail.com' and password 'Omari@2016'
    And User click on login button
    Then User should be logged in into Account

  @updatePI
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Ragnord' and Phone '278784003460'
    And User click on Update button
    Then user profile information should be updated

  @paymentMethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4688222238300555 | Guardians  |              12 |           2026 |          419 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @addressEdit
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill edit address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt | city       | state | zipCode |
      | Afghanistan | Eisa     |  2799090908 | 123 Florin rd |  50 | Sacramento | CA    |   95822 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
