package annotation.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo {

    @BeforeTest
    public void openBrowser(){
        System.out.println("Browser is opened");

    }

    @AfterTest
    public void closeBrowser(){
        System.out.println("Browser is closed");

    }

    @Test
    public void login(){
        System.out.println("Login is completed");
    }

    @Test
    public void search(){
        System.out.println("Search is completed");
    }

    @Test
    public void logout(){
        System.out.println("Logout is completed");
    }
}
