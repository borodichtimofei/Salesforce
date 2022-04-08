package tests;

import dto.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class NewContactTest extends BaseTest {

    @Test(description = "Create new contact")
    public void createNewContact() {
        loginSteps.login();
        Contact contact = new Contact("Timo", "Bo", "123456", "654321",
                "Mr.", "sad@by.by", "123456", "123456", "On Site",
                "text", "TMS");
        contactsSteps.create(contact);
    }
}
