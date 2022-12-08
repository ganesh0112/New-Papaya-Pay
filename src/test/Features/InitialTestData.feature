@InitialData
Feature: Initial Test data

  @addTestData @regression
  Scenario: add contacts in Contacts list and Accounts in Organizations list
    Given Navigate to Contact lists through site Content
    Then go to Contacts List
    Then add Contacts
    Then close current window
#    Below line is added by Prasad on 20/12/2021
    Then scroll up to Organizations List
    Then go to Organizations List
    Then add Accounts
    Then close current window



