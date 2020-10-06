package signin;

import SetUp.SetUpTests;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.SigninPage;

public class SignInTests extends SetUpTests {
    @Test
    public void testSignin() throws InterruptedException{
        signinPage.enterUsername("beccatester44337");
        signinPage.enterPassword("testersis2334#");
        DashboardPage dashboardPage= SigninPage.clickSiginBtn();
        dashboardPage.clickUser();
        signinPage=dashboardPage.clickLogout();
    }
}
