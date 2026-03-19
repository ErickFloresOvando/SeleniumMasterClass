package testng.demo;

import org.testng.annotations.Test;

public class SignUpTest {

    //Sanity
    @Test(groups = "sanity")
    public void createAccountTest(){
        System.out.println("Account is created");

    }
}
