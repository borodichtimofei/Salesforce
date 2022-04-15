package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class HomePage extends BasePage {

    public static final By TITLE = By.xpath("//span[contains(text(),'Home')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage isPageOpened() {
        log.info("Waiting for Homepage to be opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    @Step("Open Homepage")
    public HomePage open() {
        log.info("Open Homepage");
        driver.get(baseUrl + "/page/home");
        waitForPageLoaded();
        return this;
    }

    @Step("Get homepage title")
    public String title() {
        log.info("Get homepage title");
        return driver.findElement(TITLE).getText();
    }
}
