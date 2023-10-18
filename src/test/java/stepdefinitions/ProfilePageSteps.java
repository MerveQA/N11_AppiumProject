package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProfilePage;
import utils.DriverManager;

public class ProfilePageSteps {

    ProfilePage profilePage = new ProfilePage(DriverManager.getDriver());

    @Then("Verifies that the search box on the Home Page")
    public void verifiesThatTheSearchBoxOnTheHomePage() {
        profilePage.verifiesThatTheSearchBoxOnTheHomePage();
    }

    @And("User clicks help button on Profile Page")
    public void userClicksHelpButtonOnProfilePage() {
        profilePage.clicksHelpButtonOnProfilePage();
    }

    @Then("Verifies that users see frequently asked questions.")
    public void verifiesThatUsersSeeFrequentlyAskedQuestions() {
        profilePage.verifiesThatUsersSeeFrequentlyAskedQuestions();
    }

    @And("User clicks Hesabim button")
    public void userClicksHesabimButton() {
        profilePage.clicksHesabimButton();
    }
}
