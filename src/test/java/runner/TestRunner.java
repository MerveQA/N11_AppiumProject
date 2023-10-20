package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

@CucumberOptions(
        tags = "@couponToFriend",
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "utils"},
        plugin = {
                "pretty", // kodları terminalde renkli görmek için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        }
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // Paralel koşma için sabit kod
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


    // TestNG Hooks
    @BeforeSuite
    public void beforeSuite(ITestContext context) {
    }

    @AfterSuite
    public void afterSuite() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
    }
}
