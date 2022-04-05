package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        Assert.assertEquals(homePage.title(), "Home");
    }
}





