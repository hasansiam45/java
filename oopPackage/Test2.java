package oopPackage;

public class Test2 {

    public static void main(String[] args) {

        Overloading teacher1 = new Overloading();
        Overloading teacher2 = new Overloading("Hasan Siam", "Male");
        teacher2.displayInfo();

        Overloading teacher3 = new Overloading("Srabony Rahman", "Female", "01777809397", 23);
        teacher3.displayInfo();

        Overloading teacher4 = new Overloading("Irin", "Female", "01777858585",25);
        teacher4.displayInfo();
    }
}
