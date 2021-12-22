package stringPackage;

import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String firstName = "Hasan";
        String lastName = "Siam";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String title = "Jahid ";
        String res = title.concat(fullName);
        System.out.println(res);  // Jahid Hasan Siam
        System.out.println(res+20);  // Jahid Hasan Siam20
        System.out.println(res.toUpperCase());  // JAHID HASAN SIAM
        System.out.println(res.toLowerCase());  // jahid hasan siam
        System.out.println(res.startsWith("J"));  // true
        System.out.println(res.startsWith("Jah"));  // true
        System.out.println(res.startsWith("Jid"));  // false
        System.out.println(res.endsWith("m"));  // true
        System.out.println(res.endsWith("am"));  // true
        System.out.println(res.endsWith("mais"));  // false

    }
}
