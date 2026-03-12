package InheritanceDemo;

public class Person {
    //Variables
    String name;
    int age;
    String address;

    //Methods
    public void printPerson(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public Person(String nm, int a, String add){
        name = nm;
        age = a;
        address = add;
    }
}
