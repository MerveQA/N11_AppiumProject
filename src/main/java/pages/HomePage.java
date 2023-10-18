package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
import utils.Log;

public class HomePage {

    ElementHelper elementHelper;

    By homePageLogo = By.id("com.dmall.mfandroid:id/navigation_bar_item_large_label_view");
    By tabHomePageList = By.id("com.dmall.mfandroid:id/navigation_bar_item_small_label_view");
    By popularSearching = By.className("android.widget.TextView");

    By searchBox = By.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBoxEx = By.id("com.dmall.mfandroid:id/etSearch");
    By searchBoxistining = By.id("com.dmall.mfandroid:id/tvListingSearchBar");

    By smartSortedText = By.id("com.dmall.mfandroid:id/listingSortTV");

    By smartSortItems = By.className("android.widget.RelativeLayout");


    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void seeHomePage() {

        elementHelper.findElement(homePageLogo);
        Log.info("HomePage görüldü");
    }

    public void clickTabOnHomePage(String tabText) {

        elementHelper.clickListElement(tabHomePageList, tabText);
        Log.info("Element tıklandı");
    }

    public void clicksTheSearchBox() {
        elementHelper.clickElement(searchBox);
    }

    public void verifiesThatTheSearchBoxMovesToTheSearchScreen() {
        String text = elementHelper.getText(popularSearching);


    }

    public void verifiesThatTheseCombinationsCanBeEnteredInTheSearchBox(DataTable dataTable) {
        for (int row = 0; row < dataTable.height(); row++) {
            String text = dataTable.cell(row, 0);

            if (row != 0) {
                elementHelper.clickElement(searchBoxistining);
            }
            elementHelper.clearElement(searchBoxEx);
            elementHelper.sendKeys(searchBoxEx, text);


            elementHelper.assertElements(homePageLogo);

        }
    }


    public void EntersToTheSearchBox(String arg0) {
        elementHelper.sendKeys(searchBoxEx, arg0);

    }

    public void verifiesThatTheUserCanSortTheSearchResultsByItems() {
        elementHelper.isEnabledListElements(smartSortItems);
    }
}