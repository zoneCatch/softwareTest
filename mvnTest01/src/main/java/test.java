import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class test {


    @Test
    public void jTest1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.jd.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("key")).sendKeys("手机");
        driver.findElement(By.className("button")).click();
        //driver.findElement(By.id("brand-18374")).click();
        String typeText = driver.findElement(By.className("J_valueList")).getText();
        Assert.assertTrue(typeText.contains("小米"));
    }


    @Test
    public void Jtest2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.jd.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("key")).sendKeys("电脑");
        driver.findElement(By.className("button")).click();
        String typeText = driver.findElement(By.className("J_valueList")).getText();
        Assert.assertTrue(typeText.contains("Lenovo"));

    }
    @Test
    public void Jtest3(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.jd.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("key")).sendKeys("电脑");
        driver.findElement(By.className("button")).click();
        String typeText = driver.findElement(By.xpath(".//*[@class='J_valueList']//li")).getText();
        System.out.println(typeText);
        Assert.assertTrue(typeText.contains("台式机"));

    }
}
