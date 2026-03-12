package testng.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametersDemo {

    private static ChromeDriver driver;

    @BeforeClass
    public void setUp(){
        //Open Browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Parameters({"userName", "password"})
    @Test(priority = 1)
    public void loginToApplication(String userName, String password) {
        //Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter username
        driver.findElement(By.name("username")).sendKeys(userName);
        //Enter password
        driver.findElement(By.name("password")).sendKeys(password);
        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
