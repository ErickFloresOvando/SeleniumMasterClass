package synchronization.demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        driver.findElement(By.name("firstname")).sendKeys(new CharSequence[]{"John"});
        driver.findElement(By.name("lastname")).sendKeys(new CharSequence[]{"Smith"});
    }
}