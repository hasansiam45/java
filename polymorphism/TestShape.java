package polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        Triangle t = new Triangle(20,30);
        Rectangle r = new Rectangle(10,20);

        System.out.println(s.area());
        System.out.println(t.area());
        System.out.println(r.area());


        // different way in dynamic dispatch
        Shape s1 = new Shape(); // reference of super class stored in s1;
        System.out.println(s1.area());

        s1 = new Triangle(20,30); // reference of triangle stored in s1;
        System.out.println(s1.area());

        s1 = new Rectangle(10,20); // reference of rectangle stored in s1;
        System.out.println(s1.area());
    }
}
