Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'john_lombard@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account

  @accountPageScenario1 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Looorne' and Phone '7069738521'
    And User click on Update button
    Then User profile information should be updated

  @accountPageScenario2
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Test@12345       | Tek@12345  | Tek@12345      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @regeration @accountPageScenario3 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 1234053458608809 | AlexJohnson |              10 |           2028 |          899 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @regeration @accountPageScenario4 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 0987654901098721 | Mike Sure |               5 |           2028 |          677 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @regeration @accountPageScenario5 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @regeration @accountPageScenario6 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress | apt | city       | state      | zipCode |
      | United States | Jye Bidn |  8767894765 | 5455 ArdenWay |  14 | Sacramento | California |   57465 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @regeration @accountPageScenario7 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress | apt | city    | state | zipCode |
      | United States | Samad Dardar |  8314448318 | 2222 Elcamino | G   | Houston | Texas |   79975 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @regeration @accountPageScenario8 @RegrationAccountPage @RegrationCapston
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
