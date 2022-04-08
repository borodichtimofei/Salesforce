package tests;

import dto.Account;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class NewAccountTest extends BaseTest {

    @Test(description = "Create new Account")
    public void createNewAccount() {
        loginSteps.login();
        Account account = new Account("TMS", "Test Company LTD", "test-company.by",
                "7777777", "8888888", "20", "1000", "Minsk", "Minsk", "221122",
                "Belarus", "Analyst", "Apparel", "text 1", "text 2",
                "text 3");
//        Account account = AccountFactory.getAccount("Analyst", "Apparel");
        accountSteps.create(account);
    }
}
