Feature: Sign In feature

  @TCsignInSenario1 @RegrationSignIn @RegrationCapston
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'hoshmande@tekschool.us' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  @TCsignInSenario2 @RegrationSignIn @RegrationCapston
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name         | email                      | password   | confirmPassword |
      | John Lombtrd | clxjjeo@tekschool.us | Tek@123456 | Tek@123456      |
    And User click on SignUp button
    Then User should be logged into account page
