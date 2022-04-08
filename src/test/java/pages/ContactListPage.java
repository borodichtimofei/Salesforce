package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactListPage extends BasePage {

    public static final By NEW_CONTACT = By.cssSelector("a[title=New]");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactListPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_CONTACT));
        return this;
    }

    @Step("Go to page 'Contacts'")
    public ContactListPage open() {
        driver.get(baseUrl + "/o/Contact/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    @Step("Click button 'New contact'")
    public NewContactModal clickNewContact() {
        driver.findElement(NEW_CONTACT).click();
        return new NewContactModal(driver);
    }
}
