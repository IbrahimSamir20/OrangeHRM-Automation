package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends PageBase {

    By myInfoButton = By.xpath("//a[@class=\"oxd-main-menu-item active\"]");
    By firstName= By.xpath("//input[@name=\"firstName\"]");
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMyInfoButton(){
        this.clickOnElement(this.myInfoButton);
    }

    public void fillFirstName (){
        this.sendKey(firstName,"ibrahim");
    }



}
