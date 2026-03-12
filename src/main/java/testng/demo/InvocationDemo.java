package testng.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class InvocationDemo {

    private static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //Open Browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(invocationCount = 2)
    public void loginToApplication() {
        //Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

}
