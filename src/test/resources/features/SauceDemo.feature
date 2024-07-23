Feature: Login

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When the user enters a valid username and password
    Then the user should be redirected to the homepage
