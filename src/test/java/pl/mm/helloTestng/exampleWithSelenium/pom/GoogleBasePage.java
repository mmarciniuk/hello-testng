package pl.mm.helloTestng.exampleWithSelenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleBasePage {

    private final WebDriver webDriver;

    @FindBy(how = How.XPATH, xpath = "/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchInput;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")
    private WebElement searchInGoogle;

    public GoogleBasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
        this.webDriver.get("https://www.google.com/");
        this.webDriver.manage().window().fullscreen();
    }


    public GoogleBasePage validate() {
        System.out.println("Some validation rules can be run here :)");
        return this;
    }

    public GoogleBasePage takeAScreenshot() {
        System.out.println("Taking screen shot ;)");
        return this;
    }

    public GoogleBasePage searchPhrase(String searchString) {
        this.searchInput.sendKeys(searchString);
        return this;
    }

    public GoogleBasePage clickSearchInGoogleButton() {
        this.searchInGoogle.click();
        return this;
    }

    public GoogleBasePage sleep(long waitInMs) throws InterruptedException {
        Thread.sleep(waitInMs);
        return this;
    }

}
