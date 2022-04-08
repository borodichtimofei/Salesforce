package pages;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDawn;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {


    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON));
        return this;
    }

    @Step("Input information new account")
    public NewAccountModal create(Account account) {
        new Input(driver, "Account Name").writeAccountInfo(account.getAccountName());
        new Input(driver, "Parent Account").writeAccountInfo(account.getParentAccountName());
        new Input(driver, "Website").writeAccountInfo(account.getWebsite());
        new Input(driver, "Phone").writeAccountInfo(account.getPhone());
        new Input(driver, "Fax").writeAccountInfo(account.getFax());
        new Input(driver, "Billing City").writeAccountInfo(account.getEmployees());
        new Input(driver, "Annual Revenue").writeAccountInfo(account.getRevenue());
        new Input(driver, "Billing City").writeAccountInfo(account.getCity());
        new Input(driver, "Billing State/Province").writeAccountInfo(account.getState());
        new Input(driver, "Billing Zip/Postal Code").writeAccountInfo(account.getZipCode());
        new Input(driver, "Billing Country").writeAccountInfo(account.getCountry());
        new Input(driver, "Copy Billing Address to Shipping Address").click();

        new DropDawn(driver, "Type").selectInfoAccount(account.getType());
        new DropDawn(driver, "Industry").selectInfoAccount(account.getIndustryType());

        new TextArea(driver, "Description").writeTextInInfoAccountCreate(account.getDescriptionText());
        new TextArea(driver, "Billing Street").writeTextInInfoAccountCreate(account.getBillingStreetText());
        new TextArea(driver, "Shipping Street").writeTextInInfoAccountCreate(account.getShippingStreetText());

        return this;
    }
}
