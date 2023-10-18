package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MyListsPage;
import utils.DriverManager;

public class MyListsSteps {

    MyListsPage myListsPage = new MyListsPage(DriverManager.getDriver());

    @And("User click my lists section on My Favorites Page")
    public void userClickMyListsSectionOnMyFavoritesPage() {
    }

    @And("User click create new list button")
    public void userClickCreateNewListButton() {
    }

    @And("User enters the name of list")
    public void userEntersTheNameOfList() {
    }

    @And("User clicks create list button")
    public void userClicksCreateListButton() {
    }

    @Then("Verifies that the list is displayed")
    public void verifiesThatTheListIsDisplayed() {
    }

    @And("User clicks the empty list")
    public void userClicksTheEmptyList() {
    }

    @And("User clicks the add firt product button")
    public void userClicksTheAddFirtProductButton() {
    }

    @And("User clicks the new product")
    public void userClicksTheNewProduct() {
    }

    @And("User clicks list button on the product pace")
    public void userClicksListButtonOnTheProductPace() {
    }

    @And("User selects the empty list")
    public void userSelectsTheEmptyList() {
    }

    @And("User clicks the save changes button the back button")
    public void userClicksTheSaveChangesButtonTheBackButton() {
    }

    @And("User clicks")
    public void userClicks() {
    }

    @And("Verifies that the choosen product is in the list")
    public void verifiesThatTheChoosenProductIsInTheList() {
    }
}
