Feature: Check Home page functionality

  Background: User logged in
    Given user open the browser
    And user is on login page
    When user enter the valid username and password
    And user click the login button
    Then user navigate to Homepage dashboard

  Scenario: verify the logout link
    When user click on welocme link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user click on dashboard link
    Then quick launch toolbar is displayed
