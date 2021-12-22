package inheritence;

public class Person extends Animal{

    String qualification;

    @Override
    void display() {
        super.display();
        System.out.println("Qualification = "+ qualification);
    }
}
