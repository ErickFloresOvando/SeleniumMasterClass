package synchronization.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
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

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("John");

        //Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Smith");

    }
}
