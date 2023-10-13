package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
import utils.Log;

public class HomePage {

    ElementHelper elementHelper;

    By homePageLogo = By.id("com.dmall.mfandroid:id/navigation_bar_item_large_label_view");
    By tabHomePageList = By.id("com.dmall.mfandroid:id/navigation_bar_item_small_label_view");


    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void seeHomePage() {
        Log.info("HomePage görüldü");
        elementHelper.findElement(homePageLogo);
    }

    public void clickTabOnHomePage(String tabText) {
        Log.info("Element tıklandı");
        elementHelper.clickListElement(tabHomePageList,tabText);
    }
}
