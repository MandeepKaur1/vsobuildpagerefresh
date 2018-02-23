/**
 * Created by mandeep.
 */

public class LoginBlock extends VSO_BuildPageRefreshTest{
    private static String userName = "mkaur@pointcare.com";
    private static String password = "Punjab&&";

    public static void login_to_visual_studio() {
        System.out.println("Navigate to Visual Studio's site");
        waitSeconds(10);

        System.out.println("Set User email");
        setText(LoginPage.txtUserEmail, userName);
        waitSeconds(5);

        click(LoginPage.btnNext);
        waitSeconds(3);

        System.out.println("Select Account Type");
        click(LoginPage.accountType);

        System.out.println("Set Password");
        setText(LoginPage.txtPassword, password);

        System.out.println(" Click Sign in");
        click(LoginPage.btnNext);
        waitSeconds(5);

        System.out.println("Select No option to Always ask for Login");
        click(LoginPage.btnNo);
        System.out.println("End of Login Block");
    }
}
