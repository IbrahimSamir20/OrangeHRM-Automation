package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMSearch extends PageBase {

    By employeeName = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By employeeId = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By SupervisorName = By.xpath("(//input[@placeholder=\"Type for hints...\"])[2]");
    By EmploymentStatus = By.xpath("(//div[@tabindex=\"0\"])[1]");
    By include = By.xpath("(//div[@tabindex=\"0\"])[2]");
    By jobTitle= By.xpath("(//div[@tabindex=\"0\"])[3]");
    By subUnit= By.xpath("(//div[@tabindex=\"0\"])[4]");
    By buttonSubmit= By.xpath("//button[@type=\"submit\"]");
    By buttonRest = By.xpath("//button[@type=\"reset\"]");

    public PIMSearch(WebDriver driver) {
        super(driver);
    }

    public void fillEmployeeName(String name){
        sendKey(employeeName,name);
    }
    public void fillEmployeeId(String name){
        sendKey(employeeId,name);
    }
    public void fillSupervisorName(String name){
        sendKey(SupervisorName,name);
    }
    public void fillEmploymentStatus(String name){
        sendKey(EmploymentStatus,name);
    }
    public void fillInclude(String name){
        sendKey(include,name);
    }
    public void fillJobTitle(String name){
        sendKey(jobTitle,name);
    }
    public void fillSubUnit (String name){
        sendKey(subUnit,name);
    }
    public void clickSubmitButton (){
        clickOnElement(this.buttonSubmit);
    }public void clickRestButton (){
        clickOnElement(this.buttonRest);
    }


}
