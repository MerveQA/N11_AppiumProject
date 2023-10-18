@ProfilePage
Feature: N11

  Scenario: User should be able to access the answers he/she wants to frequently asked questions.
    Given User should see the Home Page
    And   User clicks Hesabim button
    And   User clicks help button on Profile Page
    Then  Verifies that users see frequently asked questions.

  Scenario: The user can sort the search results by smart sorting, that is, increasing price,
  decreasing price, bestseller, most commented, newest
    Given User should see the Home Page
    And   User clicks the search box
    And   User enters "hotWheels" to the search box
    Then  Verifies that The user can sort the search results by items

  Scenario: User verifies that questions and answers in the FQA section are displayed

  Scenario: User verifies that it is possible to navigate to the search page from the FQA section




