package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseUrl + "/page/home");
        waitForPageLoaded();
    }

    public String title() {
        return driver.findElement(By.xpath("//span[contains(text(),'Home')]")).getText();
    }
}
