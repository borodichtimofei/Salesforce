package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDawn {

    WebDriver driver;
    String label;

    public DropDawn(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectInfoAccount(String option){
        driver.findElement(By.xpath
                (String.format("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//a", label))
        ).click();
        driver.findElement(By.cssSelector(String.format("a[title='%s']", option))).click();
    }

    public void selectInfoContact (String optional){
        driver.findElement(By.xpath
                (String.format("//label[text()='%s']//..//..//div/button", label))
        ).click();
        driver.findElement(By.xpath(String.format("//span[text()='%s']", optional))).click();

    }


}


//label[text()='Salutation']//..//..//div/button

//button[data-value='Dr.']