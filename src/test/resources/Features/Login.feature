Author Shiva
Date 11/04/2023
Feature: feature to test login functionality
	
	
	@smoketest
  Scenario: Check login is successfull with valid credentials
    Given User is on login page
    When User enter the Username and Password
    And User clik the login button
    Then User is navigate to the Home page
