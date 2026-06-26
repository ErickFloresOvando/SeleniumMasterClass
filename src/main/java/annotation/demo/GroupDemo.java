package annotation.demo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupDemo {

    @BeforeGroups(groups = {"A","B"})
    public void beforeGroups(){
        System.out.println("This is before groups");
    }

    @AfterGroups(groups = {"A","B"})
    public void afterGroups(){
        System.out.println("This is after groups");
    }

    @Test(groups = "A")
    public void testA(){
        System.out.println("This is test A");

    }

    @Test(groups = "B")
    public void  testB(){
        System.out.println("This is test B");
    }


}
