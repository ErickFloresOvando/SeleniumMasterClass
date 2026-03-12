package testng.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTestCases {

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

    @Test(priority = 2)
    public void searchLeave(){
        //Click on leave button
        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        //Click on leave list
        driver.findElement(By.xpath("//a[text()='Leave List']")).click();
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
