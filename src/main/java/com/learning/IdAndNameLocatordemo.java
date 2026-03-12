package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatordemo {
    public static void main(String[] args) {
        //Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64 2/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Open Facebook url
        driver.get("https://www.facebook.com/");

        //Enter Email id by id locator
        driver.findElement(By.id("email")).sendKeys("test@test.com");

        //Enter password, by name locator
        driver.findElement(By.name("pass")).sendKeys("test123");


    }
}
