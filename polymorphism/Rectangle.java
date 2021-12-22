package polymorphism;

public class Rectangle extends Shape{
    double base, height;

    Rectangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.print("Rectangle area = ");
        return 0.5 * base * height;
    }
}
