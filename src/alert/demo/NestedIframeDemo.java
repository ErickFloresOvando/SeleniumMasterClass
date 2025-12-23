package alert.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeDemo {
    public static void main(String[] args) {
        // Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser: window.maximize()
        driver.manage().window().maximize();

        // Open application
        driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");

        // Switch from HTML page to parent frame
        driver.switchTo().frame("frame-top");

        // Switch from parent frame to child frame
        driver.switchTo().frame("frame-middle");

        // Identify web element
        WebElement text = driver.findElement(By.id("content"));

        // Print the text of web element
        System.out.println("Text of second iframe is: " + text.getText());

        // Come out from child iframe to parent frame
        driver.switchTo().parentFrame();

        // Come out from parent frame to HTML page
        driver.switchTo().defaultContent();

    }
}
