package oopPackage;

public class OverloadTest {
    public static void main(String[] args) {
        MethodOverloading test1 = new MethodOverloading();
        test1.add();
        test1.add(10,20);
        test1.add(5.5,6.2);
        test1.add(5,10,15);
    }
}
