package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

@Log4j2
public class LoginSteps {

    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Step("Log in by '{user}' using password '{password}'")
    public void login(String user, String password) {
        log.info("Log in by {} using password {}", user, password);
        loginPage
                .open()
                .isPageOpened()
                .login(user, password)
                .isPageOpened();
    }
}
