@regression
Feature: Chase HelpfulTips Functionality

  Scenario: Open Chase HelpfulTips
    Given Open Chase website
    When Search for Customer Service
    When Select More helpful tips videos
    When Select Personal Banking
    When select Replace your debit card
	Then Item page should play video