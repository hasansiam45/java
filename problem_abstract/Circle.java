package problem_abstract;

public class Circle extends Shape{
    Circle (double r) {
        super(r,r);
    }

    @Override
    void area() {
        double result = Math.PI * d1 * d2;
        System.out.println("Circle Area = " + result);
    }
}
