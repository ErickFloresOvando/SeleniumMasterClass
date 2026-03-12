package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserDemo {
    public static void main(String[] args) {

        //Specify path of ChromeDriver exe
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64 2/chromedriver");

        //Crear una instancia
        ChromeDriver driver = new ChromeDriver();

        //Navegar a Google
        driver.get("https://www.facebook.com/");

    }
}
