package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class MyListsPage {

    ElementHelper elementHelper;




    public MyListsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


}
