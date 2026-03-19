package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsDemo {

    @Test
    public void applyLeave(){
        Assert.assertEquals(true,true);
        System.out.println("Leave is applied");

    }

    @Test(dependsOnMethods = "applyLeave")
    public void approveLeave(){
        System.out.println("Leave is approved");
    }
}
