package synchronization.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open Facebook Login page
        driver.get("https://www.facebook.com/");

        //Click on create a new account button
        driver.findElement(By.linkText("Create new account")).click();

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Expected condition
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        //Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("John");

        //Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Smith");

    }
}
