package javascript.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        //Enter username
        WebElement userName = driver.findElement(By.name("username"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].value = 'Admin'", userName);

        //Enter password
        js.executeScript("document.getElementsByName('password')[0].value='admin123'");

        //Click on login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click()",loginBtn);

        //Get title
        String title = js.executeScript("return document.title").toString();
        System.out.println("Page title is: " + title);

        //Get URL
        String url = js.executeScript("return document.URL").toString();
        System.out.println("Page URL is: " + url);


    }
}
