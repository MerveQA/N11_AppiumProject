package stepdefinitions;

import io.cucumber.java.en.*;
import pages.zzPopupPage;
import utils.DriverManager;

public class zzPopupSteps {
    zzPopupPage popupPage = new zzPopupPage(DriverManager.getDriver());


    @When("Click {string} on popup")
    public void clickOnPopup(String popup) {

        popupPage.clickPopup(popup);
    }
}
