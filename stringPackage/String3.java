package stringPackage;

public class String3 {
    public static void main(String[] args) {
        String stat = "I love java";
        String stat2 = "  I love   javaScript also  ";

        char firstLetter = stat.charAt(0);
        int asciiValue = stat.codePointAt(0); // return 0 index => "I" ascii value;
        int firstInd = stat.indexOf("l"); // return first l index no;
        int lastInd = stat.lastIndexOf("l"); // return last l index no;
        String strimmedStat = stat2.trim();  // trims the spaces of first and last of a string;
        System.out.println(strimmedStat);
        String changedStat = stat.replace("I","You");
        System.out.println("After changed "+ changedStat);

        // we can replace the same string using string buffer
        StringBuffer newStr = new StringBuffer("I love you");
        newStr.replace(0, 1, "You");
        System.out.println(newStr);
        // You love you
        newStr.replace(9, 12, "Me");
        System.out.println(newStr);
        newStr.append(" so much ");
        System.out.println(newStr);
        newStr.append(5);
        System.out.println(newStr);
        newStr.delete(0,5);
        System.out.println(newStr);
        newStr.reverse();
        System.out.println(newStr);
        newStr.setLength(10);
        System.out.println(newStr);




    }
}
