package hrm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import report.ExtentReportUtils;

import java.time.Duration;

public class BaseTest {

        public static WebDriver driver;

        @BeforeSuite
        public void initDriver(){

            ExtentReportUtils.setUpReport();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");

        }

}
