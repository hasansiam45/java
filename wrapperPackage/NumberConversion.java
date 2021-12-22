package wrapperPackage;

public class NumberConversion {

    public static void main(String[] args) {

        int a = 20;
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toOctalString(a);
        String s3 = Integer.toHexString(a);

        double d = 35.25;
        String s4 = Double.toHexString(d);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
