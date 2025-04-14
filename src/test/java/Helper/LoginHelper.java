package Helper;
import tests.TestBase;
import pages.LoginPage;
public class LoginHelper {
    LoginPage loginPage = new LoginPage(TestBase.driver);

    public void LoginWithValidUsernameAndValidPassword()  {
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
    }
}
