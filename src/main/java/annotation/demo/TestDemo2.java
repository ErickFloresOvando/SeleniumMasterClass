package annotation.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestDemo2 {

    @BeforeSuite
    public void createConnection(){
        System.out.println("Database connection is created");
    }

    @AfterSuite
    public void closeConnection(){
        System.out.println("Database connection is closed");
    }

    @Test
    public void testLogin(){
        System.out.println("Login is completed");

    }
}
