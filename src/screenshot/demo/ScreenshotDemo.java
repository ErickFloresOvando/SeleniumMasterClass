package screenshot.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File image = screenshot.getScreenshotAs(OutputType.FILE);

        //Copy
        File myFile = new File("/Users/erickfloresovando/Documents/Programming/IdeaProjects/SeleniumMasterclass/Screenshots/Image1.png");
        FileUtils.copyFile(image,myFile);
    }
}
