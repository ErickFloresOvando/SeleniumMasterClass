package window.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class MultipleTabsDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        //Open ICICI Home page
        driver.get("https://www.icicibank.com");

        //Click on later button pop up
        driver.findElement(By.id("push-modal-close")).click();

        //Click on Login button
        driver.findElement(By.linkText("LOGIN")).click();

        //Get the window id of 1st tab
        String firstTabWindowID = driver.getWindowHandle();
        System.out.println("First tab window ID is: " + firstTabWindowID);

        //Click on About Us link
        driver.findElement(By.linkText("About Us")).click();

        //Switch focus from 1st tab to 2nd tab
        Set<String> allWindowIds = driver.getWindowHandles();
        for (String s: allWindowIds)    {
            if(!s.equals((firstTabWindowID))){
                driver.switchTo().window(s);
            }
        }

        //Click on History link
        driver.findElement(By.linkText("History")).click();

        //Switch focus from 2nd tab to first tab
        driver.switchTo().window(firstTabWindowID);

        //Enter value in search text box
        driver.switchTo().frame("Revamp_Banner_ID");
        driver.findElement(By.id("Search")).sendKeys("test");


    }
}
