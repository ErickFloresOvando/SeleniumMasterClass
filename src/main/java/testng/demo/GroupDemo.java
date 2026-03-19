package testng.demo;

import org.testng.annotations.Test;

public class GroupDemo {

    @Test(groups = {"login","sanity"})
    public void login_1(){
        System.out.println("Login 1");

    }
    @Test(groups = "login")
    public void login_2(){
        System.out.println("Login 2");

    }
    @Test(groups = "reset")
    public void resetPassword_1(){
        System.out.println("resetPassword 1");

    }
    @Test(groups = {"reset","sanity"})
    public void resetPassword_2(){
        System.out.println("resetPassword 2");

    }
}
