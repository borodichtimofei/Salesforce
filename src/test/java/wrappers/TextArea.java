package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    WebDriver driver;
    String label;

    public TextArea (WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextInInfoAccountCreate(String text){
        driver.findElement
                        (By.xpath(String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//textarea", label)))
                .sendKeys(text);
    }

    public void writeTextInInfoContactCreate(String text){
        driver.findElement
                        (By.xpath(String.format("//label[text()='%s']//..//..//div/textarea", label)))
                .sendKeys(text);
    }
}
