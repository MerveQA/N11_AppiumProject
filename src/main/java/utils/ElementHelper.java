package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;


    public ElementHelper(WebDriver driver) {
        String time = ConfigReader.getProperty("wait");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void yazdir(By degisken) {
        List<WebElement> elements = driver.findElements(degisken);
        for (WebElement e : elements) {
            System.out.println(e.getText());
        }

    }

    public void findElement(By locator) {
        Log.info("Element bulundu");
        driver.findElement(locator);
    }

    public WebElement checkElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
        Log.info("elemente tıklandı");
    }

    public void clickListElement(By locator, String text) {
        boolean check = false;
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        for (WebElement element : elements) {
            System.out.println(element.getText());
            if (element.getText().contains(text)) {
                element.click();
                check = true;
                break;
            }
        }
        Assert.assertTrue(check, "Listede istediğin textdeki elementi bulamadım");
    }


    public void cl(By loc, String text) {
        List<WebElement> list = driver.findElements(loc);
        for (WebElement element : list) {
            System.out.println(element.getText());
        }
        for (WebElement element : list) {
            if (element.getText().equals(text)) {
                element.click();
                break;
            }
        }

    }

    public void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        // element.sendKeys(text);
        Actions action = new Actions(driver);
        action.sendKeys(text).sendKeys(Keys.ENTER).build().perform();

    }

    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    // sadece scrollDown işlemini yapar
    public void scrollDown() {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = driver.manage().window().getSize().getHeight() / 2;
        int endx = driver.manage().window().getSize().getWidth() / 2;
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 0);
        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endx, endY));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        ((RemoteWebDriver) driver).perform(List.of(scroll));
    }

    // sadece scrollUp işlemini yapar
    public void scrollUp() {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        int endx = driver.manage().window().getSize().getWidth() / 2;
        int endY = driver.manage().window().getSize().getHeight() / 2;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 0);
        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endx, endY));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        ((RemoteWebDriver) driver).perform(List.of(scroll));
    }

    public void findElementWithScroll() {
        int i = 0;
        List<WebElement> elements = driver.findElements(By.xpath(""));
        String previusPageSource = driver.getPageSource();
        while (elements.isEmpty()) {
            scrollDown();
            String nextPageSource = driver.getPageSource();
            if (previusPageSource == nextPageSource) {
                break;
            } else {
                previusPageSource = nextPageSource;
            }
            elements = driver.findElements(By.xpath(""));
            i++;
        }
    }

    public WebElement scroll(By by) {
        int i = 0;
        String previusPageSource = "";
        while (checkElemenEnabled(by) && checkEndOfPage(previusPageSource) && i < 5) {
            i++;
            previusPageSource = driver.getPageSource();
            scrollDown();
        }
        return driver.findElement(by);
    }

    public boolean checkEndOfPage(String previusPageSource) {
        return !previusPageSource.equals(driver.getPageSource());
    }

    public boolean checkElemenEnabled(By by) {
        return driver.findElements(by).isEmpty();
    }

    public void assertElement(By locator) {

        Assert.assertTrue(driver.findElement(locator).isEnabled());
        Log.info("Element bulundu");
    }

    public void clearElement(By locator) {

        driver.findElement(locator).clear();
        Log.info("Element temizlendi");
    }

    public void assertElements(By homePageLogo) {
        Assert.assertTrue(driver.findElement(homePageLogo).isEnabled());

    }

    public void isEnabledListElements(By smartSortItems) {
        List<WebElement> list = driver.findElements(smartSortItems);
        for (WebElement element : list) {
            System.out.println(element.getText());
        }
        for (WebElement element : list) {
            Assert.assertTrue(element.isEnabled());
        }
    }
}