package keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");

        //Switch to iframe by id
        driver.switchTo().frame("iframeResult");

        //Perform double click event
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-click me']"));
        Actions action = new Actions(driver);
        action.doubleClick(button).perform();

    }
}
