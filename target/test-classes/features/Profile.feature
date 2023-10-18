@ProfilePage
 Feature:

  Scenario: User should be able to access the answers he/she wants to frequently asked questions.
    Given User should see the Home Page
    And   User clicks Hesabim button
    And   User clicks help button on Profile Page
    Then  Verifies that users see frequently asked questions.



