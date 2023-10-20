Feature: Profile process

  @newAccount
  Scenario: User can create new account
    When tap on my account
    And tap on sign up
    And enter "name" "surname" "email@gmail.com" "5321111111" "password1234"
    And select gender "erkek"
    And tap check box to term
    And tap on phone certify button

  @editAccount
  Scenario: User can change the user name
    When tap on my account
    And log in "etsyfranketsy@gmail.com" and "ironman9"
    And tap on profile
    And tap on settings icon
    And tap on subscription information
    And tap on edit
    And change name "Spiderman" and surname "Marvel"
    And tap on update
    Then assert the name "Spiderman" and surname "Marvel"