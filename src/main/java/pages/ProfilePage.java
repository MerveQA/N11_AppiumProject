package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProfilePage {

    ElementHelper elementHelper;

    By helpButton = By.id("com.dmall.mfandroid:id/iv_help");
    By searchBox = By.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By frequentlyQustion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget." +
            "LinearLayout/android.widget.RelativeLayout/android.webkit.WebView");
    By profile = By.id("com.dmall.mfandroid:id/navigation_account");

    public ProfilePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void verifiesThatTheSearchBoxOnTheHomePage() {
        elementHelper.assertElement(searchBox);
    }

    public void clicksHelpButtonOnProfilePage() {
        elementHelper.clickElement(helpButton);
    }

    public void verifiesThatUsersSeeFrequentlyAskedQuestions() {
        elementHelper.assertElement(frequentlyQustion);
    }

    public void clicksHesabimButton() {
        elementHelper.clickElement(profile);
    }
}
