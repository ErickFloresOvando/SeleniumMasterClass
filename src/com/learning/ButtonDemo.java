package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Identify button element
        WebElement addElementBtn = driver.findElement(By.xpath("//button[text()='Add Element']"));

        //Display status
        boolean isDisplayedStatus = addElementBtn.isDisplayed();
        System.out.println("Is displayed status is: " + isDisplayedStatus);

        //Enable status
        boolean isEnabledStatus = addElementBtn.isEnabled();
        System.out.println("Is enabled status is: " + isEnabledStatus);

        //Get the name of button
        String buttonName = addElementBtn.getText();
        System.out.println("Button name is: " + buttonName);

        //Click on button
        addElementBtn.click();

    }
}
