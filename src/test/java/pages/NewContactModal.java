package pages;

import dto.Contact;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

@Log4j2
public class NewContactModal extends BasePage {

    public static final By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@name='SaveEdit']");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewContactModal isPageOpened() {
        log.info("Waiting for Contact modal to be opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON));
        return this;
    }

    @Step("Input information new contact")
    public NewContactModal create(Contact contact) {
        log.info("Creation of contact {}", contact);
        new Input(driver, "First Name").writeContactInfo(contact.getFirstName());
        new Input(driver, "Last Name").writeContactInfo(contact.getLastName());
        new Input(driver, "Phone").writeContactInfo(contact.getPhone());
        new Input(driver, "Mobile").writeContactInfo(contact.getMobile());
        new DropDown(driver, "Salutation").selectInfoContact(contact.getTypeSalutation());
        new Input(driver, "Email").writeContactInfo(contact.getEmail());
        new Input(driver, "Title").writeContactInfo(contact.getTitle());
        new Input(driver, "Fax").writeContactInfo(contact.getFax());
        new DropDown(driver, "Lead Source").selectInfoContact(contact.getTypeLeadSource());
        new TextArea(driver, "Mailing Street").writeTextInInfoContactCreate(contact.getText());
        new Input(driver, "Account Name").writeAndSelect(contact.getAccountName());
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SAVE_BUTTON)));
        return this;
    }
}


