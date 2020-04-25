package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTest {
    WebDriver driver;
    By homePageStr = By.xpath(".//*[@name='details']");

    public HomePageTest(WebDriver driver) {
        this.driver=driver;
    }
    public String getHomePageTestStr(){
        return driver.findElement(homePageStr).getText();
    }
}
