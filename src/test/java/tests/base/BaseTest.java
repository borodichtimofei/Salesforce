package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;
import steps.AccountSteps;
import steps.ContactsSteps;
import steps.LoginSteps;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    public BasePage basePage;
    protected HomePage homePage;
    public LoginPage loginPage;
    protected NewAccountModal newAccountModal;
    protected NewContactModal newContactModal;
    protected AccountListPage accountListPage;
    protected ContactListPage contactListPage;
    protected AccountSteps accountSteps;
    protected LoginSteps loginSteps;
    protected ContactsSteps contactsSteps;

    public static final String USER = "borokko1980-rcsm@force.com";
    public static final String PASSWORD = "Test1980";

    @BeforeMethod(description = "Opening browser")
    public void setup(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        context.setAttribute("driver", driver);


        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        newAccountModal = new NewAccountModal(driver);
        newContactModal = new NewContactModal(driver);
        accountListPage = new AccountListPage(driver);
        contactListPage = new ContactListPage(driver);
        accountSteps = new AccountSteps(driver);
        loginSteps = new LoginSteps(driver);
        contactsSteps = new ContactsSteps(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Close browser")
    public void close() {
        driver.quit();
    }
}
