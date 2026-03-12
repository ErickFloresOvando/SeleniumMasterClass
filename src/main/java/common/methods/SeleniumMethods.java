package common.methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Open application: get()
        driver.get("https://the-internet.herokuapp.com/");

        //Maximize the browser: window.maximize()
        driver.manage().window().maximize();

        //Get the title of page: getTitle()
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Get the URL of page: getCurrentUrl()
        String url = driver.getCurrentUrl();
        System.out.println("Page URL is: " + url);


    }
}
