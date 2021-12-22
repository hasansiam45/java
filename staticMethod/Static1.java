package staticMethod;

public class Static1 {

    int x = 10;
    static int y = 20;

    void display1 () {
        display2();
        System.out.println("I am not static method");
        System.out.println("x = "+x);
        System.out.println("Y = "+y);
    }

    static void display2 () {
//        display1();  // cant access non static method inside a static method
        System.out.println("I am static method");
//        System.out.println("X = "+ x); // non static variable cant be accessed inside a static method;
        System.out.println("Y = "+y);
    }
}
