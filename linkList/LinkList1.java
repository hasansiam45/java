package linkList;

import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<>();
        countryNames.add("Bangladesh");
        countryNames.add("Afganistan");
        countryNames.add("Pakistan");
        countryNames.add("Island");
        countryNames.add(3, "Russia"); // insert russia in index 3
        countryNames.addFirst("Australia");  // inserts on first index
        countryNames.addLast("Africa");  // inserts on last index
        countryNames.removeFirst();
        countryNames.removeLast();
        countryNames.remove(2);
        countryNames.remove("Russia");

//        System.out.println(countryNames);
        for (String x: countryNames) {
            System.out.print(x + " ");
        }

        System.out.println();

//        size of list
        System.out.println("Size  = " + countryNames.size());

//        get first element
        System.out.println(countryNames.getFirst());

//        get last element
        System.out.println(countryNames.getLast());

//    clear the linkedlist
//        countryNames.clear();
//        System.out.println(countryNames);
    }



}
