package steps;

import dto.Contact;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.ContactListPage;
import pages.NewContactModal;

@Log4j2
public class ContactsSteps {

    ContactListPage contactListPage;
    NewContactModal newContactModal;

    public ContactsSteps(WebDriver driver) {
        contactListPage = new ContactListPage(driver);
        newContactModal = new NewContactModal(driver);
    }

    @Step("Creation of contact: '{contact.contactName}'")
    public void create(Contact contact) {
        log.info("Creation of contact: '{contact.contactName}'");
        contactListPage
                .open()
                .isPageOpened()
                .clickNew()
                .isPageOpened()
                .create(contact)
                .save();
    }
}
