package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class CouponPage {

    WebDriver driver;
    ElementHelper elementHelper;

    By mainTopListElements = By.id("com.dmall.mfandroid:id/ivShortcutItem");
    By createCouponButton = By.id("com.dmall.mfandroid:id/tv_uc_uc_coupons_title");
    By createFlyCouponButton = By.id("com.dmall.mfandroid:id/create_uc_uc_coupon_button");
    By createfinalCouponButton = By.id("com.dmall.mfandroid:id/create_coupon_button");
    By pointBox = By.id("com.dmall.mfandroid:id/text_input_edit_text");
    By couponDiscount = By.id("com.dmall.mfandroid:id/couponCenterListRowDiscountTV");
    By putPointBackButton = By.id("com.dmall.mfandroid:id/restore_point_button");
    By approveCoupon = By.id("com.dmall.mfandroid:id/btn_primary");
    By allCouponsList = By.id("com.dmall.mfandroid:id/couponCustomSubListButton");
    By totalFlyPoint = By.id("com.dmall.mfandroid:id/tv_point_value");
    By flyToFriendButton = By.id("com.dmall.mfandroid:id/share_button");
    By shareBoxes = By.id("com.dmall.mfandroid:id/text_input_edit_text");
    By pointTransferButton = By.id("com.dmall.mfandroid:id/btn_transfer_point");

    public CouponPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void tapOnCouponButton() {
        elementHelper.clickListElementNumber(mainTopListElements, 2);
    }

    public void tapOnCreateCouponButton() {
        elementHelper.clickElement(createCouponButton);
    }

    public void tapOnCreateCouponButtonAgain() {
        elementHelper.clickElement(createFlyCouponButton);
    }

    public void enterTheAmountOfPoint(String point) {
        elementHelper.sendKeys(pointBox, point);
    }

    public void tapOnFinalCreateCouponButton() {
        elementHelper.clickElement(createfinalCouponButton);
    }

    public void assertTheCouponDiscount(String discount) {
        String actualDiscount = elementHelper.getText(couponDiscount);
        System.out.println("actualDiscount = " + actualDiscount);
        System.out.println("expectedDiscount = " + discount);
        Assert.assertEquals(actualDiscount, discount);

    }

    public void tapOnPutPointBackButton() {
        elementHelper.clickElement(putPointBackButton);
        elementHelper.clickElement(approveCoupon);

    }

    public void tapOnFlyCouponsButton() {
        elementHelper.clickListElementNumber(allCouponsList, 2);
    }

    public void assertTheTotalPoint(String totalPoint) {
        String actualPoint = elementHelper.getText(totalFlyPoint);
        System.out.println("actualPoint = " + actualPoint);
        System.out.println("expectedPoint = " + totalPoint);
        Assert.assertEquals(actualPoint, totalPoint);
    }

    public void tapOnFlyToFriendButton() {
        elementHelper.clickElement(flyToFriendButton);
    }

    public void enterTheFriendsPhone(String phone) {
        elementHelper.sendKeysListElement(shareBoxes, "Telefon", phone);
    }

    public void enterThePoint(String point) {
        elementHelper.sendKeysListElement(shareBoxes, "Puan", point);

    }

    public void tapOnPointTransferButton() {
        elementHelper.clickElement(pointTransferButton);
    }
}
