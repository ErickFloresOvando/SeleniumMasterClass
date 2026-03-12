package InheritanceDemo;

public class Student extends Person{
    String courseName;
    int fees;

    public void printStudent(){
        System.out.println(courseName);
        System.out.println(fees);
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public Student(String nm, int a, String add,String cn,int fee){
        super(nm,a,add);
        courseName = cn;
        fees = fee;

    }
}
