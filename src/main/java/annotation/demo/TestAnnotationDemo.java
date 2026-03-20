package annotation.demo;

import org.testng.annotations.Test;

@Test
public class TestAnnotationDemo {

    public void login(){
        System.out.println("Login is executed");

    }

    public void logout(){
        System.out.println("Logout is executed");

    }
}
