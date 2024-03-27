Feature: Feature for Login functionality

  Scenario: Verify the login functionality with valid credentials
    Given User open the browser and enter the application URL
    And User is on the Login page
    When User enter the valid username and password
    And User click on login button
    Then User navigate to homepage dashboard
