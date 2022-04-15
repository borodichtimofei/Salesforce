package tests;

import dto.Account;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class NewAccountTest extends BaseTest {

    @Test(description = "Create new Account")
    public void createNewAccount() {
        loginSteps.login(USER, PASSWORD);
        Account account = Account.builder()
                .accountName("TMS")
                .parentAccountName("Test Company LTD")
                .website("test-company.by")
                .phone("7777777")
                .fax("8888888")
                .employees("20")
                .revenue("1000")
                .city("Minsk")
                .state("Minsk1")
                .zipCode("12345")
                .country("Belarus")
                .type("Analyst")
                .industryType("Apparel")
                .descriptionText("text1")
                .billingStreetText("text2")
                .shippingStreetText("text3")
                .build();

//        Account account = AccountFactory.getAccount("Analyst", "Apparel");
        accountSteps.create(account);
    }
}
