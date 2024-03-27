Feature: feature for google search functionality

	@smoke
  Scenario: verify the google search functionality
    Given user open a browser
    And user is on google page
    When user enter text in search feild
    And user hit the enter button
    Then user navigat to the result page