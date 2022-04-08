package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountListPage extends BasePage {

    public static final By NEW_ACCOUNT = By.cssSelector("a[title=New]");
    public static final By TITLE = By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountListPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    @Step("Go to page 'Accounts'")
    public AccountListPage open() {
        driver.get(baseUrl + "/o/Account/list?filterName=Recent");
        waitForPageLoaded();
        return this;
    }

    @Step("Click button 'New account'")
    public NewAccountModal clickNewAccount() {
        driver.findElement(NEW_ACCOUNT).click();
        return new NewAccountModal(driver);
    }
}
