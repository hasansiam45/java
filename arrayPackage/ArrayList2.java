package arrayPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        ArrayList <Integer> number2 = new ArrayList<>();
        number.add(5);
        number.add(-10);
        number.add(1);
        number.add(20);

        number2.addAll(number);

        System.out.println("Number 1 = " + number);
        System.out.println("Number 2 = " + number2);

        Collections.sort(number2);
        System.out.println("Sorted Number 2 = " + number2);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Sorted descending number 1 = "+ number);

    }
}
