package annotation.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodsDemo {

    // Login --> search & Add to cart --> logout
    // Login --> search & remove --> logout

    @BeforeMethod
    public void login(){
        System.out.println("Login is completed");

    }

    @AfterMethod
    public void logout(){
        System.out.println("Logout is completed");

    }

    @Test
    public void addTocart(){
        System.out.println("Product is added to cart");
    }

    @Test
    public void remove(){
        System.out.println("Product is removed");
    }
}
