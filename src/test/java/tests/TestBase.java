package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // تأكد من تحميل الصفحة بالكامل
        try {
            Thread.sleep(2000); // يمكن استبداله بـ WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    @AfterMethod
//    public void closeBrowser(){
//        driver.quit();
//    }
}
