package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.SigninPage;

public class SetUpTests {
    //import selenium webdriver
    private WebDriver driver;
    //create Sign in page object
    protected SigninPage signinPage;

    @BeforeTest
    public void setUp() {
        //selenium Webdriver needs this executable in order to know which browserto run your test
        //Browser setup for chrome
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //launch the application
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //instantiate login name after launching the browser - handle
        signinPage = new SigninPage(driver);
    }

    @AfterTest
    public void closeBrowser()
    {
        //close window
        driver.quit();
    }

}


