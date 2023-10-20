package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverManager;
import utils.ElementHelper;

import java.sql.Driver;

public class ProfilePage {
    public ProfilePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    WebDriver driver;
    ElementHelper elementHelper;

    By myAccountButton = By.id("com.dmall.mfandroid:id/navigation_account");
    By signUpButton = By.id("com.dmall.mfandroid:id/btn_sign_up");
    By boxList = By.id("com.dmall.mfandroid:id/text_input_edit_text");
    By genderMan = By.id("com.dmall.mfandroid:id/gender_man");
    By popUpAdvertisement = By.id("com.dmall.mfandroid:id/dialogImageView");
    By closePopUpButton = By.id("com.dmall.mfandroid:id/btnClose");
    By checkBoxes = By.id("com.dmall.mfandroid:id/iv_checkbox");
    By verifyPhoneNumber = By.id("com.dmall.mfandroid:id/btn_verify_button");
    By logInButton = By.id("com.dmall.mfandroid:id/btn_login");
    By logInBoxes = By.id("com.dmall.mfandroid:id/text_input_edit_text");
    By settingsButton = By.id("com.dmall.mfandroid:id/iv_account_settings");
    By accountInfoButton = By.id("com.dmall.mfandroid:id/accountSettingsMemberInformationRL");
    By editButton = By.id("com.dmall.mfandroid:id/tv_edit_personal_info");
    By nameSurnameBoxes = By.id("com.dmall.mfandroid:id/text_input_edit_text");
    By updateButton = By.id("com.dmall.mfandroid:id/btn_activate");
    By nameSurname = By.id("com.dmall.mfandroid:id/tv_name_surname");
    By homePageButton = By.id("com.dmall.mfandroid:id/navigation_home");


    public void tapOnMyAccount() {
        elementHelper.ifDisplayedClose(popUpAdvertisement, closePopUpButton);
        elementHelper.clickElement(myAccountButton);
    }

    public void tapOnSignUp() {
        elementHelper.clickElement(signUpButton);
    }

    public void enter(String name, String surname, String email, String phone, String password) {

        elementHelper.sendKeysListElement(boxList, "Ad", name);
        elementHelper.sendKeysListElement(boxList, "Soyad", surname);
        elementHelper.sendKeysListElement(boxList, "E-Posta Adresi", email);
        elementHelper.sendKeysListElement(boxList, "Telefon", phone);
        elementHelper.scrollDown();
        elementHelper.sendKeysListElement(boxList, "ifre", password);
    }

    public void selectGender() {
        elementHelper.clickElement(genderMan);
    }

    public void tapCheckBoxToTerm() {
        elementHelper.clickListElementNumber(checkBoxes, 1);
    }

    public void tapOnPhoneCertifyButton() {
        elementHelper.scrollDown();
        elementHelper.clickElement(verifyPhoneNumber);
    }

    public void logInAnd(String email, String password) {
        elementHelper.clickElement(logInButton);
        elementHelper.sendKeysListElement(logInBoxes, "Posta", email);
        elementHelper.sendKeysListElement(logInBoxes, "ifre", password);
        elementHelper.clickElement(logInButton);


    }

    public void tapOnSettingsIcon() {
        elementHelper.clickElement(settingsButton);
    }

    public void tapOnSubscriptionInformation() {
        elementHelper.clickElement(accountInfoButton);
    }

    public void tapOnEdit() {
        elementHelper.clickElement(editButton);
    }

    public void changeNameAndSurname(String name, String surname) {
        elementHelper.clearSendKeysListElement(nameSurnameBoxes, 1, name);
        elementHelper.clearSendKeysListElement(nameSurnameBoxes, 2, surname);
    }

    public void tapOnUpdate() {
        elementHelper.clickElement(updateButton);
    }

    public void assertTheNameAndSurname(String name, String surname) {
        String actualData = elementHelper.getText(nameSurname);
        System.out.println("actualData = " + actualData);
        String expectedData = name + " " + surname;
        System.out.println("expectedData = " + expectedData);
        Assert.assertEquals(actualData, expectedData);
    }

    public void tapOnHomePageButton() {
        elementHelper.clickElement(homePageButton);
    }


}
