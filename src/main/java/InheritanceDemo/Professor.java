package InheritanceDemo;

public class Professor extends Person{
    int salary;
    int exp;

    public void printProfessor(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(salary);
        System.out.println(exp);
    }

    public Professor(String nm, int a, String add,int sal, int ex){
        super(nm,a,add);
        salary = sal;
        exp = ex;
    }
}
