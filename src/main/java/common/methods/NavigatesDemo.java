package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatesDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize the browser: window.maximize()
        driver.manage().window().maximize();

        //Open application
        driver.navigate().to("https://the-internet.herokuapp.com/");

        //Click on any link
        driver.findElement(By.linkText("Broken Images")).click();
        Thread.sleep(5000);

        //Click on back button of browser
        driver.navigate().back();
        Thread.sleep(5000);

        //Click on forward button of browser
        driver.navigate().forward();
        Thread.sleep(5000);

        //Refresh the URL
        driver.navigate().refresh();



    }
}
