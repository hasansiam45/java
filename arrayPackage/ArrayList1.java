package arrayPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = input.nextInt();

        ArrayList<Integer> number = new ArrayList<>();

        System.out.println("Give input for array = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            int v = input.nextInt();
            number.add(v);
        }

        System.out.println(number.size());
        // System.out.println(number);
//        for (int x: number) {
//            System.out.print(x + " ");
//        }

        // another way with iterator
        Iterator itr = number.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }


    }
}
