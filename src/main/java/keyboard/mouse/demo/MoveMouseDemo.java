package keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class MoveMouseDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.amazon.in/");

        //Move mouse over Account & List link

        WebElement accountAndListLink = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions action = new Actions(driver);
        action.moveToElement(accountAndListLink).build().perform();
        Thread.sleep(5000);

        //Click on your order link
        WebElement yourOrderLink = driver.findElement(By.xpath("//span[text()='Your Orders']"));
        action.click(yourOrderLink).build().perform();

        //Enter email id
        WebElement emailIdTextBox = driver.findElement(By.id("ap_email"));
        action.sendKeys(emailIdTextBox,"test@test.com").build().perform();

    }
}
