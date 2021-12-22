package oopPackage;

public class CountingObject {
    static int count = 0;

    CountingObject(){
        count++;
        System.out.println("total object = " + count);
    }

//    void displayCount(){
//        System.out.println("total object = " + count);
//    }
}
