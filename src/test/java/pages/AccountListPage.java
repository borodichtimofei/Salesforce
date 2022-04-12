package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AccountListPage extends BasePage {

    public static final By NEW_ACCOUNT = By.cssSelector("a[title=New]");
    public static final By TITLE = By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountListPage isPageOpened() {
        log.info("Waiting for Account list to be opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    @Step("Go to page 'Accounts'")
    public AccountListPage open() {
        log.info("Go to page 'Accounts'");
        driver.get(baseUrl + "/o/Account/list?filterName=Recent");
        waitForPageLoaded();
        return this;
    }

    @Step("Click button 'New account'")
    public NewAccountModal clickNewAccount() {
        log.info("Click button 'New account'");
        driver.findElement(NEW_ACCOUNT).click();
        return new NewAccountModal(driver);
    }
}
