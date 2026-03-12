package screenshot.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class OrangeHRMLogin {
    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();


    // Open login page

    driver.get("https://opensource-demo.orangehrmlive.com/");
    captureScreenshot(driver, "loginPage");

    // Enter username
    driver.findElement(By.name("username")).sendKeys("Admin");
    captureScreenshot(driver, "username");

    // Enter password
    driver.findElement(By.name("password")).sendKeys("admin123");
    captureScreenshot(driver, "password");

    // Click on login button
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    captureScreenshot(driver, "homepage");

    }

    public static void captureScreenshot(WebDriver driver, String fileName) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File image = screenshot.getScreenshotAs(OutputType.FILE);
        File myFile = new File("/Users/erickfloresovando/Documents/Programming/IdeaProjects/SeleniumMasterclass/Screenshots/" + fileName + ".png");

        try {
            FileUtils.copyFile(image, myFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}