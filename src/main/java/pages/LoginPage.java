package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    By username = By.xpath("//input[@name=\"username\"]");
    By password = By.xpath("//input[@name=\"password\"]");
    By loginButton = By.xpath("//button[@type=\"submit\"]");
    public LoginPage(WebDriver driver) {
//        super(driver);
           super(driver)   ;
    }

    public void fillUserName(String name){
        sendKey(username,name);
    }

    public void fillPassword(String password){
        sendKey(this.password,password);
    }

    public void clickLoginButton(){
        clickOnElement(this.loginButton);
    }
}


