package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserDemo {
    public static void main(String[] args) {

        //Crear una instancia
        SafariDriver driver = new SafariDriver();

        //Navegar a Google
        driver.get("https://www.facebook.com/");

    }
}

