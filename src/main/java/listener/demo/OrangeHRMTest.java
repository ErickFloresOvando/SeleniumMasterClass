package listener.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTest {

    private static WebDriver driver;

    @BeforeClass
    public void setUp(){
        //Open Browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void login() {
        //Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    /*
    @Test
    public void testAdmin(){
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }*/

    @Test(priority = 2)
    public void leaveOption(){
        //Click on leave button
        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        //Click on leave list
        driver.findElement(By.xpath("//a[text()='Leave List']")).click();
    }

    @Test(priority = 3)
    public void logout(){
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        driver.findElement(By.linkText("Logout")).click();
    }


    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
