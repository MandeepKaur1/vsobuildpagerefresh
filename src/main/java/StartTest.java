import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


/**
 * Created by mandeep.
 */

public class StartTest {

    public static WebDriver driver = null;

    /*Set Browser to run scripts*/
    public static String browserName = "Chrome"; //To test run locally

    /**
     * Getting Browser to run all scripts
     *
     * @param BrowserType = Browser
     */
    public static WebDriver getBrowser(String BrowserType) {
        System.out.println("All Browser Instance");
        {
            if (BrowserType.equals("Firefox")) {
                System.out.println("Open FireFox Browser");
                driver = new FirefoxDriver();
            } else if (BrowserType.equals("Chrome")) {
                System.out.println("Open Chrome Browser");
                driver = new ChromeDriver();
            }
        }
        System.setProperty("webdriver.chrome.driver", "/Users/mandeep/Documents/vsobuildpagerefresh/chromedriver");

        return driver;
    }

    /**
     * getBrowser - Browser to run test against.
     */
    @BeforeTest
    public void getDriver() {
        getBrowser(browserName);
        driver.manage().window().maximize();
    }

    /**
     * Close WebDriver after every class.
     */
    @AfterClass
    public void closeDriver() {
        if (driver != null)
            driver.getCurrentUrl();
        driver.quit();
    }
}
