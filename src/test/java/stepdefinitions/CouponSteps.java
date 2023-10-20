package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CouponPage;
import pages.ProfilePage;
import utils.DriverManager;

public class CouponSteps {
    CouponPage couponPage = new CouponPage(DriverManager.getDriver());


    @And("tap on coupon button")
    public void tapOnCouponButton() {
        couponPage.tapOnCouponButton();
    }

    @And("tap on create coupon button")
    public void tapOnCreateCouponButton() {
        couponPage.tapOnCreateCouponButton();
    }

    @And("tap on create coupon button again")
    public void tapOnCreateCouponButtonAgain() {
        couponPage.tapOnCreateCouponButtonAgain();
    }

    @And("enter the amount of point {string}")
    public void enterTheAmountOfPoint(String point) {
        couponPage.enterTheAmountOfPoint(point);
    }

    @And("tap on final create coupon button")
    public void tapOnFinalCreateCouponButton() {
        couponPage.tapOnFinalCreateCouponButton();
    }

    @And("assert the coupon discount {string}")
    public void assertTheCouponDiscount(String discount) {
        couponPage.assertTheCouponDiscount(discount);
    }

    @When("tap on put point back button")
    public void tapOnPutPointBackButton() {
        couponPage.tapOnPutPointBackButton();
    }

    @And("tap on flyCoupons button")
    public void tapOnFlyCouponsButton() {
        couponPage.tapOnFlyCouponsButton();
    }

    @And("assert the total point {string}")
    public void assertTheTotalPoint(String totalPoint) {
        couponPage.assertTheTotalPoint(totalPoint);
    }

    @And("tap on fly to friend button")
    public void tapOnFlyToFriendButton() {
        couponPage.tapOnFlyToFriendButton();

    }

    @And("enter the friends phone {string}")
    public void enterTheFriendsPhone(String phone) {
        couponPage.enterTheFriendsPhone(phone);
    }

    @And("enter the point {string}")
    public void enterThePoint(String point) {
        couponPage.enterThePoint(point);
    }

    @And("tap on point transfer button")
    public void tapOnPointTransferButton() {
        couponPage.tapOnPointTransferButton();
    }
}
