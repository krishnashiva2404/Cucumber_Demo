Feature: Feature is verify the trace project login functionality
	
	@smoke @regression
  Scenario Outline: verify the trace project login functionality with valid credentials
    Given User enter the trace project Url in the browser
    And User landing on the trace project login page
    When User enter the valid credientials of <Username> and <Password>
    And User click on the login button
    Then User navigate to the application home page dashboard

    Examples: 
      | Username     | Password |
      | shivakrishna |    12345 |
