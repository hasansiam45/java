package polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Teacher t1 = new Teacher();
        Student s1 = new Student();

        p1.display();
        t1.display();
        s1.display();


        // different way to understand polymorphism
        Person p2 = new Person(); // Person reference stored to p2;
        p2.display();  // I am a Person

        p2 = new Teacher(); // Teacher reference stored to p2 now;
        p2.display();  // I am a Teacher

        p2 = new Student(); // Student reference stored to p2 now;
        p2.display();  // I am a Student
    }
}
