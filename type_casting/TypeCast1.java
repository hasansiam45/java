package type_casting;

public class TypeCast1 {
    public static void main(String[] args) {
        int x = 10;
        double y = x;
        System.out.println("Y after automatic type casting = " + y);
        x = (int) y;  // explicitly changing type
        System.out.println(x); // 10

        double a = 10.8;
        int b = (int) a;
        System.out.println("b after type casting = " + b); // 10
    }
}
