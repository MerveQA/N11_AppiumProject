package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class zzPopupPage {
    ElementHelper elementHelper;
    By popupList = By.className("android.widget.Button");


    public zzPopupPage(WebDriver driver){
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickPopup(String popup) {
        elementHelper.clickListElement(popupList,popup);
    }
}
