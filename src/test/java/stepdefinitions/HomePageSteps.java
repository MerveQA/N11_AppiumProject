package stepdefinitions;

import io.cucumber.java.en.Given;
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
}
