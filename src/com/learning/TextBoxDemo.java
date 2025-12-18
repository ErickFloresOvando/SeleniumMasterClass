package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {
    public static void main(String[] args) throws InterruptedException{
        //Open Chrome brower
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64 2/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Open application
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        //Identify text box
        WebElement emailTextBox = driver.findElement(By.name("email"));

        //Text box is displayed or not
        boolean isDisplayedStatus = emailTextBox.isDisplayed();
        System.out.println("Is displayed status is: " + isDisplayedStatus);

        //Text box is enabled or not
        boolean enableStatus = emailTextBox.isEnabled();
        System.out.println("Is enabled status is: " + enableStatus);

        //Enter value in text box
        emailTextBox.sendKeys("selenium@test.com");
        Thread.sleep(5000);

        //Get the entered value from text box
        String enteredValue = emailTextBox.getAttribute("value");
        System.out.println("Entered value of text box is: " + enteredValue);

        //Delete the value
        emailTextBox.clear();

    }
}
