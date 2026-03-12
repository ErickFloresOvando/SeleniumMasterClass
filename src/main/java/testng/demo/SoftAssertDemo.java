package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertDemo {
    private static ChromeDriver driver;

    @BeforeClass
    public void setUp(){
        //Launch Browser
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void checkIfAllCheckBoxIsSelected(){
        //Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Click on leave button
        driver.findElement(By.xpath("//span[text()='Leave']")).click();

        boolean isDateCheckBoxSelected = driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).isDisplayed();

        //Soft Assert
        SoftAssert softAssertDemo = new SoftAssert();

        softAssertDemo.assertTrue(isDateCheckBoxSelected);

        //Pending Approval displayed
        boolean isPendingApproval = driver.findElement(By.xpath("//span[text()='Pending Approval ']")).isDisplayed();
        Assert.assertTrue(isPendingApproval);

        softAssertDemo.assertAll();

    }

}
