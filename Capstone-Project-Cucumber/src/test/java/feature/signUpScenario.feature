@FlyAway
Feature: This feature will run all the SignUp scenarios

  @Test(1)
  Scenario Outline: This scenario will test the User SignUp features
    Given I am on home page
    When I click on Login button
    And I click on signUp button
    Then I should be landing on the Registration page "FLYAWAY - MEMBER REGISTRATION"
    And I enter the required details
      | Email id         | abc@example.com              |
      | Password         | Xyz@123                      |
      | Confirm Password | Xyz@123                      |
      | Name             | John Bill                    |
      | Address          | 45g, Fernhill street, E126DD |
      | City             | London                       |
    And I click on Signup button
    Then I should be redirected to appropriate page
    
     @Test(2)
  Scenario: This scenario will test login failure function
    Given I am on home page
    When I click on Login button
    When I enter the wrong details
      | abc@example.com |
      | abc@xyz         |
    And I click signIn button
    Then I should be shown login failure text "Login failed"
    @Test(3)
    Scenario: This scenario will test the login success function of the application
    Given I am on home page
    When I click on Login button
    And I enter the right credentials
    |abc@example.com|
    |Xyz@123|
    And I click signIn button
    Then I should be landing on the flyAway Home page "Edit Profile"
    
    @Test(4)
    Scenario: This scenario will test the flight booking scenario between Bangalore and Chennai
    Given I am on home page
    When I click on Login button
    And I enter login details
    |abc@example.com|
    |Xyz@123|
    And I click signIn button
    And I click home button
    And I select location from "Bangalore"
    And I select the destination To "Chennai"
    And I click submit button
    And I should be able to see flight booking option "Book Flight"
    And I click flight button
    And I click complete booking
    And I click your bookings
    Then I should be able to see booking confirmation "4500"
    

 
