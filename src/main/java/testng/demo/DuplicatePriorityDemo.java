package testng.demo;

import org.testng.annotations.Test;

public class DuplicatePriorityDemo {

    @Test(priority = 2)
    public void a(){
        System.out.println("This is test case a");
    }

    @Test(priority = 2)
    public void c(){
        System.out.println("This is test case c");
    }


}
