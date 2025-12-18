package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.facebook.com/r.php");

        //Identify radio button element
        WebElement secondRadioButton = driver.findElement(By.xpath("//input[@value='2']"));

        //Display status
        boolean isDisplayedStatus = secondRadioButton.isDisplayed();
        System.out.println("Is displayed status is: " + isDisplayedStatus);

        //Enable status
        boolean isEnabledStatus = secondRadioButton.isEnabled();
        System.out.println("Is enabled status is: " + isEnabledStatus);

        //Select a radio button
        secondRadioButton.click();
        Thread.sleep(5000);

        //get selected status of radio button
        boolean isSelectedStatus = secondRadioButton.isSelected();
        System.out.println("Is selected status is: " + isSelectedStatus);

        //Unselect radio button
        WebElement firstRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
        firstRadioButton.click();

        //Driver quit
        driver.quit();
        

    }
}
