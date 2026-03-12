package screenshot.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class AshotDemo {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://facebook.com/about/privacy/previous");

        Screenshot screenshot = new AShot().takeScreenshot(driver);

        File image = new File("/Users/erickfloresovando/Documents/Programming/IdeaProjects/SeleniumMasterclass/AshotImages/test.png");

        ImageIO.write(screenshot.getImage(),"png",image);

    }
}
