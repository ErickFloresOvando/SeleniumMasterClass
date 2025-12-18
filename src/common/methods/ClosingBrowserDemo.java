package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingBrowserDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize the browser: window.maximize()
        driver.manage().window().maximize();

        //Open application
        driver.navigate().to("https://the-internet.herokuapp.com/");

        //Scroll down page
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //Click on Elemental Selenium Link
        driver.findElement(By.linkText("Elemental Selenium")).click();
        Thread.sleep(5000);

        //Close()
        //driver.close();

        //Quit()
        driver.quit();
    }
}
