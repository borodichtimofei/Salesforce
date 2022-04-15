package tests;

import dto.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class NewContactTest extends BaseTest {

    @Test(description = "Create new contact")
    public void createNewContact() {
        loginSteps.login(USER, PASSWORD);
        Contact contact = Contact.builder()
                .firstName("Timo")
                .lastName("Bo")
                .phone("123456")
                .mobile("654321")
                .typeSalutation("Mr.")
                .email("test@test.by")
                .title("123456")
                .typeLeadSource("On Site")
                .text("text")
                .accountName("TMS")
                .build();
        contactsSteps.create(contact);
    }
}
