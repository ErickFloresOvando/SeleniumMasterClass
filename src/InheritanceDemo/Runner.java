package InheritanceDemo;

public class Runner {
    public static void main(String[] args) {
        Student std1 = new Student("Mike",25,"US","Java",500);
        std1.printStudent();

        Professor p1 = new Professor("Smith", 35,"US",7000,10);
        p1.printProfessor();

    }
}
