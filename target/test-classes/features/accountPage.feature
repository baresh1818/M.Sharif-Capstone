Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sharif.test@gmail.com' and password 'Tek@11223344'
    And User click on login button
    And User should be logged in into Account

  @AccountTC1 @regeration @RegrationCapston
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Baruiiish' and Phone '91600000000'
    And User click on Update button
    Then User profile information should be updated

  @AccountTC2
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@11223344     | Tek@112233  | Tek@112233      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @AccountTC3 @regeration @RegrationCapston
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1164448556885521 | Baresh     |              11 |           2025 |          999 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @AccountTC4 @regeration @RegrationCapston
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1987653901097777 | Barish     |               9 |           2029 |          777 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @AccountTC5 @regeration @RegrationCapston
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @AccountTC6 @regeration @RegrationCapston
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName      | phoneNumber | streetAddress    | apt | city       | state      | zipCode |
      | United States | salem shaheen |  9168587454 | 1010 marconi ave |  10 | sacramento | California |   95821 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @AccountTC7 @regeration @RegrationCapston
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName     | phoneNumber | streetAddress | apt | city    | state | zipCode |
      | United States | Samad Dardar |  8314448318 | 2222 Elcamino | G   | Houston | Texas |   79975 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @AccountTC8 @regeration @RegrationCapston
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
