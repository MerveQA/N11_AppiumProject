package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ProfilePage;
import utils.DriverManager;

public class ProfileSteps {
    ProfilePage profilePage = new ProfilePage(DriverManager.getDriver());

    @When("tap on my account")
    public void tapOnMyAccount() throws InterruptedException {
        profilePage.tapOnMyAccount();
    }

    @And("tap on sign up")
    public void tapOnSignUp() {
        profilePage.tapOnSignUp();
    }

    @And("enter {string} {string} {string} {string} {string}")
    public void enter(String name, String surname, String email, String phone, String password) {
        profilePage.enter(name,surname,email,phone,password);
    }

    @And("select gender {string}")
    public void selectGender(String arg0) {
        profilePage.selectGender();
    }

    @And("tap check box to term")
    public void tapCheckBoxToTerm() {
        profilePage.tapCheckBoxToTerm();
    }

    @And("tap on phone certify button")
    public void tapOnPhoneCertifyButton() {
        profilePage.tapOnPhoneCertifyButton();
    }

    @When("log in {string} and {string}")
    public void logInAnd(String email, String password) {
        profilePage.logInAnd(email, password);
    }

    @And("tap on profile")
    public void tapOnProfile() {

    }

    @And("tap on settings icon")
    public void tapOnSettingsIcon() {
        profilePage.tapOnSettingsIcon();
    }

    @And("tap on subscription information")
    public void tapOnSubscriptionInformation() {
        profilePage.tapOnSubscriptionInformation();
    }

    @And("tap on edit")
    public void tapOnEdit() {
        profilePage.tapOnEdit();
    }

    @And("change name {string} and surname {string}")
    public void changeNameAndSurname(String name, String surname) {
        profilePage.changeNameAndSurname(name,surname);
    }

    @And("tap on update")
    public void tapOnUpdate() {
        profilePage.tapOnUpdate();
    }

    @Then("assert the name {string} and surname {string}")
    public void assertTheNameAndSurname(String name, String surname) {
        profilePage.assertTheNameAndSurname(name,surname);
    }

    @And("tap on home page button")
    public void tapOnHomePageButton() {
        profilePage.tapOnHomePageButton();
    }

}
