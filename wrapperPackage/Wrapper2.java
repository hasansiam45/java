package wrapperPackage;

public class Wrapper2 {

    public static void main(String[] args) {
        // primitive to string
        int a = 30;
        double b = 20.55;
        boolean c = true;

        String x = Integer.toString(a);
        String y = Double.toString(b);
        String z = Boolean.toString(c);

        System.out.println(x + " " + y + " " + z);


        // string to primitive

        String s1 = "20";
        String s2 = "35.25";
        String s3 = "true";

        int i  = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);
        boolean bo = Boolean.parseBoolean(s3);

        System.out.println(i + " " + d + " "+ bo);
    }
}
