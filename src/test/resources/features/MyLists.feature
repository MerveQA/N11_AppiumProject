@MyListPage
Feature: N11

  Scenario: User creates new list
    Given User should see the Home Page
    When  Click "Listelerim" Tab on Home Page
    And   User click my lists section on My Favorites Page
    And   User click create new list button
    And   User enters the name of list
    And   User clicks create list button
    Then  Verifies that the list is displayed



  Scenario: User adds the first new product to the list
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page
    And   User click my lists section on My Favorites Page
    And User clicks the empty list
    And User clicks the add firt product button
    And User clicks the new product
    And User clicks list button on the product pace
    And User selects the empty list
    And User clicks the save changes button the back button
    And User clicks
    And Verifies that the choosen product is in the list




  Scenario: User views lists shared with the user
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page


  Scenario: User views their listings
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page


  Scenario: User can delete their listings
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page


  Scenario: User can edit their lists
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page


  Scenario: User can share their lists with others
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page


  Scenario: User can move the products in his/her list to another list
    Given User should see the Home Page
    When Click "Listelerim" Tab on Home Page
