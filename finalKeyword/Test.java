package finalKeyword;

public class Test {
    public static void main(String[] args) {
        University u1 = new University();
//        u1.NAME = "DU"; // Cannot assign a value to final variable 'NAME'
//        u1.FEES = 15000; // Cannot assign a value to final variable 'NAME'
//        u1.display();

        Student s1 = new Student();
        s1.display();
        s1.uniInfo();
        s1.infoFinal();
    }
}
