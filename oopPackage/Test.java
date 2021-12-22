package oopPackage;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Hasan Siam", "Male", 25, "01777809397");
//        teacher1.age = 25;
//        teacher1.gender = "Male";
//        teacher1.name = "Hasan Siam";
//        teacher1.phone = "01777809397";
//        teacher1.setInfo("Hasan Siam", "Male", 25, "01777809397"); // parameterized method
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher("Jahid Siam", "Male", 24, "01777709397");
//        teacher2.age = 24;
//        teacher2.gender = "Male";
//        teacher2.name = "Jahid Siam";
//        teacher2.phone = "01777709397";
//        teacher2.setInfo("Jahid Siam", "Male", 24, "01777709397"); // parameterized method
        teacher2.displayInfo();

        Teacher teacher3 = new Teacher();

    }
}
