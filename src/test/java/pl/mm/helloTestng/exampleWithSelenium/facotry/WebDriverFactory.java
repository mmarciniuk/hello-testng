package pl.mm.helloTestng.exampleWithSelenium.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class WebDriverFactory {

    public static WebDriver getWebDriver(DriverType driverType) throws URISyntaxException {
        WebDriver webDriver = null;

        //noinspection SwitchStatementWithTooFewBranches
        switch (driverType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", Paths.get(ClassLoader.getSystemResource("chromedriver.exe").toURI()).toString());
                webDriver = new ChromeDriver();
                break;
        }

        return webDriver;
    }

}
