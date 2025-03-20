import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase{
    LoginPage loginPage ;

    @BeforeMethod
    public void init (){
        loginPage = new LoginPage(driver);
    }
@Test
    public void loginWithValidUsernameAndValidPassword(){
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickLoginButton();
    }

}
