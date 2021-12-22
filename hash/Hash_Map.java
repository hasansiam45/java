package hash;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        // put, get
        HashMap <Integer,String> customer = new HashMap<Integer,String>();

        customer.put(1, "siam");
        customer.put(2, "hasan");
        customer.put(3, "jahid");
        customer.put(4, "jahid hasan");

        System.out.println(customer.get(1));
        System.out.println(customer.get(2));
        System.out.println(customer.get(3));
        System.out.println(customer.get(4));

    }
}
