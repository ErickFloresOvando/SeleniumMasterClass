package testng.demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestCase {

    protected static WebDriver driver;
    @Test
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

    }
}
