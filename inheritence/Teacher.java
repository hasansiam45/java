package inheritence;

public class Teacher extends Person {
   int salary;

    @Override
    void display() {
        super.display();
        System.out.println("Salary = " + salary);
    }
}
