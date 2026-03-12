package AbstractClassDemo;

public abstract class Vehicle {

    //Abstract method
    public abstract void run();

    //non abstract method

    public void testMethod(){
        System.out.println("This is non abstract method of Vehicle");
    }

    String name;

    public Vehicle(String n){
        name = n;
    }
}
