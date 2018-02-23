import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mandeep.
 */

public class VSO_BuildPageRefresh extends BaseUITest {

      @Test public static void main() throws Exception{
        String buildPageUrl = "https://pointcare.visualstudio.com/PointCarePlatform/_build?_a=queued";

        LoginBlock loginBlock = new LoginBlock();
        System.out.println("Login to Visual Studio");
        loginBlock.login_to_visual_studio();
        waitSeconds(5);

        System.out.println("Navigate to build Page URL ");
        navigateTo(buildPageUrl);
        waitSeconds(10);

        System.out.println("Verify that user is navigate to Build Page successfully");
        String url = getCurrentUrl();
        System.out.println("Current URL is " + url);
        Assert.assertEquals(url, buildPageUrl,"User is not on Build page");
    }
}
