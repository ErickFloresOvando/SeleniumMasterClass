package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertEqualsDemo {
    @Test
    public void loginToOrangeHRM(){
        //Launch Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64-2/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Variables
        String actualurl = driver.getCurrentUrl();
        String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        boolean dashboardIsDisplayedStatus = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();

        //Assertions
        Assert.assertEquals(actualurl, expectedurl);
        //Assert.assertNotEquals(actualurl, expectedurl);
        Assert.assertTrue(dashboardIsDisplayedStatus);

    }


}
