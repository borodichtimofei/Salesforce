package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class ContactListPage extends BasePage {

    public static final By NEW_CONTACT = By.cssSelector("a[title=New]");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactListPage isPageOpened() {
        log.info("Waiting for Contact list to be opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_CONTACT));
        return this;
    }

    @Step("Go to page 'Contacts'")
    public ContactListPage open() {
        log.info("Go to page 'Contacts'");
        driver.get(baseUrl + "/o/Contact/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    @Step("Click button 'New contact'")
    public NewContactModal clickNew() {
        log.info("Click button 'New contact'");
        driver.findElement(NEW_CONTACT).click();
        return new NewContactModal(driver);
    }
}
