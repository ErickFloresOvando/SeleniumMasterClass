package javascript.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.facebook.com/privacy/explanation");
        Thread.sleep(5000);

        //Scroll down page to see Donation link on screen
        WebElement donationLink = driver.findElement(By.linkText("Oversight Board"));
        JavascriptExecutor js = driver;
        //js.executeScript("arguments[0].scrollIntoView(true);", donationLink);

        //Scroll down the page until the end
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }
}
