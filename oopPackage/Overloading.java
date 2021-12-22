package oopPackage;

public class Overloading {
    String name, gender, phone;
    int age;
    static String country = "Bangladesh";
    Overloading(){
        System.out.println("No information");
        System.out.println();
    }

    Overloading(String n, String g){
        name = n;
        gender = g;
    }

    Overloading(String n, String g, String p, int a){
        name = n;
        gender = g;
        phone = p;
        age = a;
    }

    void displayInfo () {
        System.out.println("Name = "+ name);
        System.out.println("Gender = "+ gender);
        System.out.println("Age = "+ age);
        System.out.println("Phone = "+ phone);
        System.out.println("Country = "+ country);
        System.out.println();
    }
}
