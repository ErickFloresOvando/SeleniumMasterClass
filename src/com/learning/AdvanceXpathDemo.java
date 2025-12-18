package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathDemo {
    public static void main(String[] args) {

        //Specify path of ChromeDriver exe
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");

        //Crear una instancia
        ChromeDriver driver = new ChromeDriver();

        //Navegar a Google
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        //contains method example
        driver.findElement(By.name("firstname")).sendKeys("John");


    }
}
