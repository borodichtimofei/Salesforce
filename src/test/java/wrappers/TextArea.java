package wrappers;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea {

    WebDriver driver;
    String label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextInInfoAccountCreate(String text) {
        log.info("Writing {} into  {}", text, label);
        if (StringUtils.isNoneEmpty(text)) {
            driver.findElement
                            (By.xpath(String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//textarea", label)))
                    .sendKeys(text);
        }
    }

    public void writeTextInInfoContactCreate(String text) {
        log.info("Writing {} into  {}", text, label);
        if (StringUtils.isNoneEmpty(text)) {
            driver.findElement
                            (By.xpath(String.format("//label[text()='%s']//..//..//div/textarea", label)))
                    .sendKeys(text);
        }
    }
}
