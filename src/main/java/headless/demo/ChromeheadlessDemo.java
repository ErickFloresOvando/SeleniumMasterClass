package headless.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeheadlessDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");

        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver(options);

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://google.com");

        //Get title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Get URL
        String url = driver.getCurrentUrl();
        System.out.println("Page URL is: " + url);
    }
}
