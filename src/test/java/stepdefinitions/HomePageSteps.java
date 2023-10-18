package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverManager.getDriver());

    @Given("User should see the Home Page")
    public void userShouldSeeTheHomePage() {
        homePage.seeHomePage();
    }

    @When("Click {string} Tab on Home Page")
    public void clickTabOnHomePage(String tabText) {
        homePage.clickTabOnHomePage(tabText);
    }

    @And("User clicks the search box")
    public void userClicksTheSearchBox() {
        homePage.clicksTheSearchBox();
    }

    @Then("Verifies that the search box moves to the search screen")
    public void verifiesThatTheSearchBoxMovesToTheSearchScreen() {
        homePage.verifiesThatTheSearchBoxMovesToTheSearchScreen();
    }

    @Then("Verifies that these combinations can be entered in the search box")
    public void verifiesThatTheseCombinationsCanBeEnteredInTheSearchBox(DataTable dataTable) {
        homePage.verifiesThatTheseCombinationsCanBeEnteredInTheSearchBox(dataTable);
    }

    @And("User enters {string} to the search box")
    public void userEntersToTheSearchBox(String arg0) {
        homePage.EntersToTheSearchBox(arg0);
    }

    @Then("Verifies that The user can sort the search results by items")
    public void verifiesThatTheUserCanSortTheSearchResultsByItems() {
        homePage.verifiesThatTheUserCanSortTheSearchResultsByItems();
    }
}
