package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    String loginURL = "https://login.salesforce.com/";
    String baseUrl = "https://skyeng3.lightning.force.com/lightning";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    public void waitForPageLoaded() {
        new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
    }

    @Step("Save information new account")
    public void save() {
        driver.findElement(SAVE_BUTTON).click();
        waitForPageLoaded();
    }


    public abstract BasePage isPageOpened();
    //TODO implement opening of the page
//    public abstract BasePage openPage();
}