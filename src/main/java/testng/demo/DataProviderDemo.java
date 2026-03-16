package testng.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {

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

    @Test(priority = 1, dataProvider = "getTestData")
    public void loginToApplication(String username, String password) {
        //Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter username
        driver.findElement(By.name("username")).sendKeys(username);
        //Enter password
        driver.findElement(By.name("password")).sendKeys(password);
        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @DataProvider
    public Object [][] getTestData(){
        Object [][] data = new Object[2][2];
        data[0][0] = "Admin";
        data[0][1] = "admin123";
        data[1][0] = "superAdmin";
        data[1][1] = "test@123";

        return data;

    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }


}
