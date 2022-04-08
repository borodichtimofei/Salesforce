package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public static final By TITLE = By.xpath("//span[contains(text(),'Home')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    @Step ("Open Homepage")
    public HomePage open() {
        driver.get(baseUrl + "/page/home");
        waitForPageLoaded();
        return this;
    }

    @Step ("Get homepage title")
    public String title() {
        return driver.findElement(TITLE).getText();
    }
}
