package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BasePage {

    @FindBy(id = "username")
    WebElement userInput;
    @FindBy(id = "password")
    WebElement userPassword;
    @FindBy(id = "login")
    WebElement loginButton;

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @Step("Opening login page")
    public void open() {
        driver.get(loginURL);
        PageFactory.initElements(driver, this);
//        wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    @Step("Log in by '{user}' using password '{password}'")
    public void login(String user, String password) {
        userInput.sendKeys(user);
        userPassword.sendKeys(password);
        loginButton.click();
        waitForPageLoaded();
    }
}