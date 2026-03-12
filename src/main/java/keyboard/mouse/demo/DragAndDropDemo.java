package keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://jqueryui.com/droppable/");

        //Switch frame
        driver.switchTo().frame(0);

        //Drag and drop operation
        WebElement smallBox = driver.findElement(By.id("draggable"));
        WebElement biggerBox = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(smallBox, biggerBox).build().perform();


    }
}
