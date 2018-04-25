Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Click me 
    Then success message is Counter data is correct 
