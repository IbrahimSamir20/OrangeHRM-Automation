package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PIMSearch;

public class PIMSearchTest extends TestBase{
    PIMSearch pimSearch ;

    @BeforeMethod
    public void init (){
        pimSearch = new PIMSearch(driver);

    }

    @Test
    public void searchWithAllDataInputIsValid(){
        loginPage.fillUserName("");
        pimSearch.fillEmployeeName("ibrahim");
        pimSearch.fillEmployeeId("1");
        pimSearch.fillSupervisorName("samir");
        pimSearch.fillInclude("Current Employees Only");
        pimSearch.fillEmploymentStatus("Freelance");
        pimSearch.fillJobTitle("Chief Executive Officer");
        pimSearch.fillSubUnit("OrangeHRM");
        pimSearch.clickSubmitButton();
    }
}
