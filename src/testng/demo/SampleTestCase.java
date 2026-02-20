package testng.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestCase {

    @Test
    public void launchGooglePage(){
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64-2/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

    }
}
