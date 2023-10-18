@HomePage
Feature: N11

  Scenario: Home Page catagories
    Given User should see the Home Page
    When Click "Kategoriler" Tab on Home Page
    When Click "Sepetim" Tab on Home Page
    When Click "Listelerim" Tab on Home Page
    When Click "Hesabım" Tab on Home Page

  @CheckResults
  Scenario:User verifies that the Search box is present on the main page and visible to the user
    Given User should see the Home Page
    Then  Verifies that the search box on the Home Page

  Scenario: User verifies that when the user clicks on the search box it moves to the search screen
    Given User should see the Home Page
    And   User clicks the search box
    Then  Verifies that the search box moves to the search screen

  Scenario: User verifies that letters, numbers, characters and their combinations can be entered in the search box.
    Given User should see the Home Page
    And   User clicks the search box
    Then  Verifies that these combinations can be entered in the search box
      | 12345         |
      | ABCDE         |
      | /(/&%+%A      |
      | 09HG%&6CDa    |

    Scenario: The user can sort the search results by smart sorting, that is, increasing price,
    decreasing price, bestseller, most commented, newest
      Given User should see the Home Page
      And   User clicks the search box
      And   User enters "hotWheels" to the search box
      Then  Verifies that The user can sort the search results by items







