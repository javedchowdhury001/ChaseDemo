@regression
Feature: Schedule a Meeting

  Scenario: Schedule a Meeting
    Given Open Chase website
    When user selects Schedule A Meeting
    And user is not a Chase customer
    And user selects radio buttion for Schedule a meeting
    And user enters required info
	Then user can proceed with confirmation
