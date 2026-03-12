package com.learning;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowserDemo {

    public static void main(String[] args) {
        //geckoDriver exe path
        System.setProperty("webdriver.gecko.driver", "/Users/erickfloresovando/Downloads/geckodriver");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
    }
}
