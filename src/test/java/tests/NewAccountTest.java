package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class NewAccountTest extends BaseTest {

    @Test(description = "Create new Account")
    public void createNewAccount() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        newAccountModal.open();
        newAccountModal.clickNewAccount();
        newAccountModal.create("TMS", "Test Company LTD", "test-company.by",
                "7777777", "8888888", "20", "1000", "Minsk", "Minsk", "221122",
                "Belarus", "Analyst", "Apparel", "text 1", "text 2",
                "text 3");
        newAccountModal.saveInfoAccount();
    }
}
