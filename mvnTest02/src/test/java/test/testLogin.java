package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePageTest;
import pages.LoginTest;
import org.junit.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class testLogin {
    WebDriver driver;
    HomePageTest homePageTest;
    LoginTest loginTest;

    @Before
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
    }

    @Test
    public void testStr(){
        loginTest=new LoginTest(driver);
        loginTest.loginTest("admin","admin");
        homePageTest=new HomePageTest(driver);
        Assert.assertTrue(homePageTest.getHomePageTestStr().contains("Congratulations!"));

    }
}
