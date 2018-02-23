
import org.testng.Assert;


public class VSO_BuildPageRefreshTest extends BaseUITest{

    @org.testng.annotations.Test
    public static void main (String[] args) throws Exception {

        driver.get("https://pointcare.visualstudio.com/PointCarePlatform/_build?_a=queued");
        waitSeconds(5);

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
        waitSeconds(300);
        driver.quit();
        System.out.println("Test Finished");

    }
}
