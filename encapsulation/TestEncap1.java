package encapsulation;

public class TestEncap1 {
    public static void main(String[] args) {
        Encapsulation1 test1 = new Encapsulation1();

//        System.out.println(test1.name);  // private var cannot access
//        System.out.println(test1.age);  // private var cannot access

        test1.displayName(); // it can be accessed
//        test1.displayAge(); // private method cannot access
    }
}
