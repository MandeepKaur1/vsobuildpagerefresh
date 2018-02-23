import org.openqa.selenium.By;

/**
 * Created by mandeep.
 */

public class LoginPage extends BaseUITest {
    public static final By txtUserEmail = By.name("loginfmt");
    public static final By btnNext = By.id("idSIButton9");
    public static final By accountType = By.cssSelector("#msaTile > div > div.table-cell.text-left.content");
    public static final By txtPassword = By.name("passwd");
    public static final By btnSignIn = By.id("idSIButton9");

    //Stay Signed in options
    public static final By btnNo = By.id("idBtn_Back");




}
