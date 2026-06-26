package annotation.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassDemo {

    @BeforeClass
    public void login(){
        System.out.println("User is logged in");
    }

    @AfterClass
    public void logout(){
        System.out.println("User is logged out");
    }

    @Test(priority = 1)
    public void search(){
        System.out.println("Product is searched");
    }

    @Test(priority = 2)
    public void addCart(){
        System.out.println("Product is added to cart");
    }

    @Test(priority = 3)
    public void makePayment(){
        System.out.println("Payment is made");
    }
}
