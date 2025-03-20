package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {
    WebDriver driver;

    public PageBase (WebDriver driver){
        this.driver = driver;
    }

    public void sendKey(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void clickOnElement(By element){
        driver.findElement(element).click();
    }
}
