package com.learning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocatorDemo {

   public static void main(String[] args) {
       //Open Google Chrome Browser
       System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64 2/chromedriver");
       ChromeDriver driver = new ChromeDriver();

       //Open Facebook Login Page
       driver.get("https://www.facebook.com/");

       //Capture all Links of Login Page
       List<WebElement> allLinks = driver.findElements(By.tagName("a"));
       System.out.println("Total Number of links are : " + allLinks.size());
       for (int i=0; i<allLinks.size();i++){
           System.out.println(allLinks.get(i).getText());

       }

        }
    }
