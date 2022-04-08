package steps;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AccountListPage;
import pages.NewAccountModal;

public class AccountSteps {

    AccountListPage accountListPage;
    NewAccountModal newAccountModal;

    public AccountSteps(WebDriver driver) {
        accountListPage = new AccountListPage(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    @Step("Creation of account: '{account.accountName}'")
    public void create(Account account) {
        accountListPage
                .open()
                .isPageOpened()
                .clickNewAccount()
                .isPageOpened()
                .create(account)
                .saveInfoAccount();
    }
}
