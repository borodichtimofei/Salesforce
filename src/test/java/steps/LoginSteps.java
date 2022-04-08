package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static tests.base.BaseTest.PASSWORD;
import static tests.base.BaseTest.USER;

public class LoginSteps {

    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Step("Log in'")
    public void login() {
        loginPage
                .open()
                .isPageOpened()
                .login(USER, PASSWORD)
                .isPageOpened();
    }
}
