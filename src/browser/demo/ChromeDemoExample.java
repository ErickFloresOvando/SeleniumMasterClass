package browser.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemoExample {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-javascript");
        //options.addArguments("--disable-notifications");

        options.addArguments("--incognito"); //Open in incognito mode

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.justdial.com");


    }
}
