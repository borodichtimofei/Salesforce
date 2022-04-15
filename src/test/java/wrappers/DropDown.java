package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DropDown {

    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectInfoAccount(String option) {
        log.info("Select {} into  {}", option, label);
        driver.findElement(By.xpath
                (String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//a", label))
        ).click();
        driver.findElement(By.cssSelector(String.format("a[title='%s']", option))).click();
    }

    public void selectInfoContact(String option) {
        log.info("Select {} into  {}", option, label);
        driver.findElement(By.xpath
                (String.format("//label[text()='%s']//..//..//div/button", label))
        ).click();
        driver.findElement(By.xpath(String.format("//span[text()='%s']", option))).click();
    }
}
