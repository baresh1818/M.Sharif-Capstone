Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'hoshmande@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account

  @accountPageScenario1
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'RezwnJanee' and Phone '7439778521'
    And User click on Update button
    Then User profile information should be updated

  @accountPageScenario2
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Test@1234567     | Testop@12345 | Testop@12345    |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’
