package hash;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet <String> fruits = new HashSet<String>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Apple");

        System.out.println(fruits);

        // another way

        for (String x: fruits) {
            System.out.print(x + " ");
        }

        // size
        System.out.println("\nSize = " + fruits.size());

        // remove
        fruits.remove("Mango");
        System.out.println("After remove " +fruits);

        System.out.println(fruits.isEmpty());

        // clear
        fruits.clear();
        System.out.println("After clear = " + fruits);

        System.out.println(fruits.isEmpty());
    }
}
