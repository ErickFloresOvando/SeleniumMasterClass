package keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open facebook login page
        driver.get("https://www.facebook.com/");

        //Right click on email text box
        WebElement emailTextBox = driver.findElement(By.id("email"));
        Actions action = new Actions(driver);
        action.contextClick(emailTextBox).build().perform();


    }
}
