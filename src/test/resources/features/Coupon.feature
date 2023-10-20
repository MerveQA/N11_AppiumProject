Feature: Coupon process

  @coupon
  Scenario: User creates a coupon and take the point back
    When tap on my account
    And log in "farukuraz16@gmail.com" and "Fz.ebr.4"
    #And tap on home page button
    #And tap on coupon button
    And tap on create coupon button
    And tap on create coupon button again
    And enter the amount of point "10"
    And tap on final create coupon button
    And tap on flyCoupons button
    Then assert the coupon discount "10"
    When tap on put point back button
    And assert the total point "78"

  @couponToFriend
  Scenario: User creates a coupon to friend and take the point back
    When tap on my account
    And log in "farukuraz16@gmail.com" and "Fz.ebr.4"
    #And tap on home page button
    #And tap on coupon button
    And tap on create coupon button
    And tap on fly to friend button
    And enter the friends phone "5354289014"
    And enter the point "10"
    And tap on point transfer button



