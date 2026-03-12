package alert.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize the browser: window.maximize()
        driver.manage().window().maximize();

        //Open application
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        //Click on button to get java script alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        //Switch focus from normal window to alert
        Alert al = driver.switchTo().alert();

        //Get the text of alert
        String alertText = al.getText();
        System.out.println("Alert text is: " + alertText);

        //Click on Ok, Cancel
        //al.accept(); //Click on Ok button of alert
        al.dismiss(); //Click on Cancel button of alert



    }
}
