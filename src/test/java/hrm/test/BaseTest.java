package orange.hrm.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import report.ExtentReportUtils;

import java.time.Duration;

public class BaseTest {

     private static WebDriver driver;

        @BeforeSuite
        public void initDriver(){

            ExtentReportUtils.setUpReport();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");

        }

}
