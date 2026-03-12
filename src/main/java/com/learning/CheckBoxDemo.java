package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64 2/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open application
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //Identify checkbox
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        //Displayed or not
        boolean isDisplayedStatus = checkBox1.isDisplayed();
        System.out.println("Is displayed status is: " + isDisplayedStatus);

        //Enable status
        boolean enableStatus = checkBox1.isEnabled();
        System.out.println("Is enabled status is: " + enableStatus);

        //Select checkbox
        checkBox1.click();
        Thread.sleep(5000);

        //check select status of checkbox
        boolean isSelectedStatus = checkBox1.isSelected();
        System.out.println("Is selected status after click is: " + isSelectedStatus);

        //Unselect checkbox
        checkBox1.click();

    }
}
