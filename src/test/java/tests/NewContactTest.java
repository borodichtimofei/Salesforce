package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class NewContactTest extends BaseTest {

    @Test(description = "Create new contact")
    public void createNewContact() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        newContactModal.open();
        newContactModal.clickNewContact();
        newContactModal.create("Timo", "Bo", "123456", "654321",
                "Mr.", "sad@by.by", "123456", "123456", "On Site",
                "text", "TMS");
        newContactModal.saveInfoContact();
        newContactModal.open();
    }
}
