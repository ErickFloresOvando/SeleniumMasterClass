package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Open application
        driver.get("https://www.skyscanner.com.sg");

        //Select a Depart Option
        WebElement departIcon = driver.findElement(By.xpath("//span[text()='Depart']"));
        departIcon.click();

        //Select a Depart date
        WebElement departDate = driver.findElement(By.xpath("//button[@aria-label='Friday, 26 December 2025. Select as departure date']"));
        departDate.click();

        //Select Return Option
        WebElement returnIcon = driver.findElement(By.xpath("//span[text()='Return']"));
        returnIcon.click();

        //Select a Return date
        WebElement returnDate = driver.findElement(By.xpath("//button[@aria-label='Friday, 2 January 2026. Select as departure date']"));
        returnDate.click();







    }
}
