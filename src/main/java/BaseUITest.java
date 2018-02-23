import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by mandeep.
 */

public class BaseUITest {
    static WebDriver driver = new ChromeDriver();

    public static void getBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/mandeep/Documents/vsobuildpagerefresh/chromedriver");
        waitSeconds(5);
    }

    /**
     * Go to other URL
     *
     * @param url URL to go to
     */
    protected static void navigateTo(String url) {
        System.out.println("navigation to url: " + url);
        driver.get(url);
    }

    /**
     * Method for setting the text.
     *
     * @param by    By selector for text input element
     * @param value text WebElement found on pointcare.page by given selector'
     */
    protected static void setText(By by, String value) {
        WebElement element = driver.findElement(by);
        System.out.println("setting text to " + value);
        element.sendKeys(value);
    }

    /**
     * Method for clicking on element
     *
     * @param by By selector for clickable element
     */
    protected static void click(By by) {
        WebElement element = driver.findElement(by);
        System.out.println("element " + element);
        element.click();
    }

    /**
     * Go to Current URL and refresh tab
     *
     * @param url URL to go to
     */
    protected static void refreshPage(String url) {
        System.out.println("navigation to url: " + url);
        driver.navigate().refresh();
    }

    /**
     * Get url of current tab
     *
     * @return url of current tab
     */
    protected static String getCurrentUrl() {
        String url = driver.getCurrentUrl();
        System.out.println("Current url: " + url);
        return url;
    }

    /**
     * Waits until given time is up.
     *
     * @param sec time to wait for
     */
    public static void waitSeconds(int sec) {
        final int DISCRETE = 60;
        final int MIN_IN_HOUR = 60;
        final int SEC_IN_MIN = 60;
        final String MESSAGE_LEFT = " seconds left...";
        final String MESSAGE_WAIT = "Wait a ";
        final String MESSAGE_MINUTES = " minutes and ";
        final String MESSAGE_SECONDS = " seconds";
        final String MESSAGE_TIME_OFF = "Time is over!";
        try {
            System.out.println(MESSAGE_WAIT + sec / MIN_IN_HOUR + MESSAGE_MINUTES + sec % SEC_IN_MIN + MESSAGE_SECONDS);
            int i = 0;
            while (i < sec / DISCRETE) {
                System.out.println("" + (sec - i * DISCRETE) + MESSAGE_LEFT);
                TimeUnit.SECONDS.sleep(DISCRETE);
                i++;
            }
            if (sec % DISCRETE != 0) {
                System.out.println("" + (sec % DISCRETE) + MESSAGE_LEFT);
                TimeUnit.SECONDS.sleep(sec % DISCRETE);
            }
            System.out.println(MESSAGE_TIME_OFF);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
