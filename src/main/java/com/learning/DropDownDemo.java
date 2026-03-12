package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.facebook.com/r.php");

        //Identify dropdown field
        WebElement birthday_month = driver.findElement(By.id("month"));
        WebElement birthday_day = driver.findElement(By.id("day"));
        WebElement birthday_year = driver.findElement(By.id("year"));



        //Select a value from list
        Select selectBirthdayMonth = new Select(birthday_month);
        Select selectBirthdayDay = new Select(birthday_day);
        Select selectBirthdayYear = new Select(birthday_year);

        //selecting option based on the index of options October
        selectBirthdayMonth.selectByIndex(9);

        //selecting option based on value attribute
        selectBirthdayDay.selectByValue("21");

        //selecting option based on visible text
        selectBirthdayYear.selectByVisibleText("1990");

        //Get selected value from drop down
        WebElement selectedOption = selectBirthdayMonth.getFirstSelectedOption();
        String selectedDropDownValue = selectedOption.getText();
        System.out.println("Selected value from drop down is: " + selectedDropDownValue);

        //Driver quit
        driver.quit();







    }
}
