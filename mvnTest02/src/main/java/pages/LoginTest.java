package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.naming.Name;


public class LoginTest {
    WebDriver driver;
    By userName=By.id("uid");
    By Password= By.id("passw");
    //By testText=By;
    By login=By.name("btnSubmit");

    public LoginTest(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserId(String userId) {
        driver.findElement(userName).sendKeys(userId);
    }

    public void setPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }

//    public void setLogin(By login) {
//        this.login = login;
//    }
    public void clicklogin(){
        driver.findElement(login).click();
    }
    public void loginTest(String userName,String Passw){
        this.setPassword(Passw);
        this.setUserId(userName);
        this.clicklogin();
    }
}
