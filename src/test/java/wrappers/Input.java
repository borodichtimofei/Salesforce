package wrappers;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Input {

    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeAccountInfo(String text) {
        log.info("Writing {} into  {}", text, label);
        if (StringUtils.isNoneEmpty(text)) {
            driver.findElement
                            (By.xpath(String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input", label)))
                    .sendKeys(text);
        }
    }

    public void writeContactInfo(String text) {
        log.info("Writing {} into  {}", text, label);
        if (StringUtils.isNoneEmpty(text)) {
            driver.findElement
                            (By.xpath(String.format("//label[text()='%s']//..//..//div/input", label)))
                    .sendKeys(text);
        }
    }

    public void writeAndSelect(String text) {
        log.info("Select {} into  {}", text, label);
        driver.findElement
                        (By.xpath(String.format("//label[text()='%s']//..//..//div/input", label)))
                .sendKeys(text);
        driver.findElement(By.xpath(String.format("//span//strong[text()='%s']", text))).click();
    }
}





