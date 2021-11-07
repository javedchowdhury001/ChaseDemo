@regression
Feature: Chase Merchant Services Functionality

  Scenario: Open Merchant Services
    Given Open Chase website
    When Search for Business Service
    When Select Merchant Services
    Then Item page should have Merchant Services
