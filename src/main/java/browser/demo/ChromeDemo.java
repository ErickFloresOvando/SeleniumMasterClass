package browser.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.Hashtable;
import java.util.Map;

public class ChromeDemo {
    public static void main(String[] args) {

        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        Map<String, Object> preferences = new Hashtable<String, Object>();
        preferences.put("download.default_directory", "F:\\");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); //Maximixe the window

        options.setExperimentalOption("prefs", preferences);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");



    }
}
