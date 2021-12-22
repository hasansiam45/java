package oopPackage;

public class Teacher {
    String name, gender, phone;
    int age;

    Teacher(){
        System.out.println("I am default constructor");
    }

    Teacher (String n, String g, int a, String ph) {
        name = n;
        gender = g;
        age = a;
        phone = ph;
    }
    void displayInfo () {
        System.out.println("Name = " +name);
        System.out.println("Gender = " +gender);
        System.out.println("Phone = " +phone);
        System.out.println("Age = " +age);
        System.out.println();
    }
}
