package pl.mm.helloTestng.exampleWithSelenium.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pl.mm.helloTestng.exampleWithSelenium.facotry.DriverType;
import pl.mm.helloTestng.exampleWithSelenium.facotry.WebDriverFactory;
import pl.mm.helloTestng.exampleWithSelenium.pom.GoogleBasePage;

import java.net.URISyntaxException;

public class SomeSimpleTest {

    private WebDriver webDriver;

    @BeforeSuite
    public void setUpWebDriver() throws URISyntaxException {
        this.webDriver = WebDriverFactory.getWebDriver(DriverType.CHROME);
    }

    @Test
    public void basicTest() throws InterruptedException {
        GoogleBasePage page = new GoogleBasePage(webDriver)
                .takeAScreenshot()
                .validate()
                .sleep(5000)
                .searchPhrase("Java")
                .takeAScreenshot()
                .validate()
                .sleep(5000)
                .clickSearchInGoogleButton()
                .takeAScreenshot()
                .validate()
                .sleep(15000);

        Assert.assertNotNull(page);
    }

    @AfterSuite
    public void webDriverCleanUp() {
        this.webDriver.quit();
    }

}
