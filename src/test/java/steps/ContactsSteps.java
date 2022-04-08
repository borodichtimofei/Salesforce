package steps;

import dto.Contact;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.ContactListPage;
import pages.NewContactModal;

public class ContactsSteps {

    ContactListPage contactListPage;
    NewContactModal newContactModal;

    public ContactsSteps (WebDriver driver){
        contactListPage = new ContactListPage(driver);
        newContactModal = new NewContactModal(driver);
    }

    @Step("Creation of contact: '{contact.contactName}'")
    public void create (Contact contact){
        contactListPage
                .open()
                .isPageOpened()
                .clickNewContact()
                .isPageOpened()
                .create(contact)
                .saveInfoContact();
    }
}
