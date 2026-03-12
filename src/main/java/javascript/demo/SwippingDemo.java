package javascript.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwippingDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.album.alexflueras.ro/");
        JavascriptExecutor js = driver;

        //From left to right
        WebElement catImage = driver.findElement(By.id("a7"));
        js.executeScript("arguments[0].scrollIntoView();", catImage);
        Thread.sleep(5000);

        //From right to left
        WebElement houseImage = driver.findElement(By.id("a3"));
        js.executeScript("arguments[0].scrollIntoView();", houseImage);
    }
}
