package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDawn;
import wrappers.Input;
import wrappers.TextArea;


public class NewContactModal extends BasePage {

    public static final By NEW_CONTACT = By.cssSelector("a[title=New]");
    public static final By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@name='SaveEdit']");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Step("Go to page 'Contacts'")
    public void open() {
        driver.get(baseUrl + "/o/Contact/list?filterName=Recent");
        waitForPageLoaded();
    }

    @Step("Click button 'New contact'")
    public void clickNewContact() {
        driver.findElement(NEW_CONTACT).click();
    }

    @Step("Input information new contact")
    public void create(String firstName, String lastName, String phone, String mobile, String typeSalutation,
                       String email, String title, String fax, String typeLeadSource, String text,
                       String accountName) {

        new Input(driver, "First Name").writeContactInfo(firstName);
        new Input(driver, "Last Name").writeContactInfo(lastName);
        new Input(driver, "Phone").writeContactInfo(phone);
        new Input(driver, "Mobile").writeContactInfo(mobile);
        new DropDawn(driver, "Salutation").selectInfoContact(typeSalutation);
        new Input(driver, "Email").writeContactInfo(email);
        new Input(driver, "Title").writeContactInfo(title);
        new Input(driver, "Fax").writeContactInfo(fax);
        new DropDawn(driver, "Lead Source").selectInfoContact(typeLeadSource);
        new TextArea(driver, "Mailing Street").writeTextInInfoContactCreate(text);
        new Input(driver, "Account Name").writeAndSelect(accountName);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SAVE_BUTTON)));
    }

    @Step("Save information new contact")
    public void saveInfoContact() {
        driver.findElement(SAVE_BUTTON).click();
        waitForPageLoaded();
    }

}


