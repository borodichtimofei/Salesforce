package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDawn;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    public static final By NEW_ACCOUNT = By.cssSelector("a[title=New]");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }


    @Step("Go to page 'Accounts'")
    public void open() {
        driver.get(baseUrl + "/o/Account/list?filterName=Recent");
        waitForPageLoaded();
    }

    @Step("Click button 'New account'")
    public void clickNewAccount() {
        driver.findElement(NEW_ACCOUNT).click();
    }

    @Step("Input information new account")
    public void create(String accountName, String parentAccountName, String website, String phone, String fax, String employees,
                       String revenue, String city, String state, String zipCode, String country,
                       String type, String industryType, String descriptionText, String billingStreetText, String shippingStreetText) {
        new Input(driver, "Account Name").writeAccountInfo(accountName);
        new Input(driver, "Parent Account").writeAccountInfo(parentAccountName);
        new Input(driver, "Website").writeAccountInfo(website);
        new Input(driver, "Phone").writeAccountInfo(phone);
        new Input(driver, "Fax").writeAccountInfo(fax);
        new Input(driver, "Billing City").writeAccountInfo(employees);
        new Input(driver, "Annual Revenue").writeAccountInfo(revenue);
        new Input(driver, "Billing City").writeAccountInfo(city);
        new Input(driver, "Billing State/Province").writeAccountInfo(state);
        new Input(driver, "Billing Zip/Postal Code").writeAccountInfo(zipCode);
        new Input(driver, "Billing Country").writeAccountInfo(country);
        new Input(driver, "Copy Billing Address to Shipping Address").click();

        new DropDawn(driver, "Type").selectInfoAccount(type);
        new DropDawn(driver, "Industry").selectInfoAccount(industryType);

        new TextArea(driver, "Description").writeTextInInfoAccountCreate(descriptionText);
        new TextArea(driver, "Billing Street").writeTextInInfoAccountCreate(billingStreetText);
        new TextArea(driver, "Shipping Street").writeTextInInfoAccountCreate(shippingStreetText);
    }

    @Step("Save information new account")
    public void saveInfoAccount() {
        driver.findElement(SAVE_BUTTON).click();
        waitForPageLoaded();
    }
}
