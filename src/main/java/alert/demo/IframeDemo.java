package alert.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize the browser: window.maximize()
        driver.manage().window().maximize();

        //Open application
        driver.get("https://jqueryui.com/dialog/");

        //Identify the element which is present inside iframe
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@title='Close']")).click();

        //Come out from iframe
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Demos")).click();
    }
}
