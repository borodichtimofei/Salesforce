package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeAccountInfo(String text){
        driver.findElement
                (By.xpath(String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input", label)))
                .sendKeys(text);
    }

    public void click (){
        driver.findElement
                        (By.xpath(String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input", label)))
                .click();
    }

    public void writeContactInfo (String text){
        driver.findElement
                        (By.xpath(String.format("//label[text()='%s']//..//..//div/input", label)))
                .sendKeys(text);
    }

    public void writeAndSelect (String text){
        driver.findElement
                        (By.xpath(String.format("//label[text()='%s']//..//..//div/input", label)))
                .sendKeys(text);
        driver.findElement(By.xpath(String.format("//span//strong[text()='%s']", text))).click();

    }




}



//label[text()='Phone']//..//..//div

