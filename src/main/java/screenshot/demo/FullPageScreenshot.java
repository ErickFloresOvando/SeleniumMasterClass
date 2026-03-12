package screenshot.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FullPageScreenshot {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //Maximize window
        //driver.manage().window().maximize();

        //Open application
        driver.get("https://facebook.com/about/privacy/previous");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        File image = new File("/Users/erickfloresovando/Documents/Programming/IdeaProjects/SeleniumMasterclass/AshotImages/testFull.png");

        ImageIO.write(screenshot.getImage(),"png",image);

    }
}
