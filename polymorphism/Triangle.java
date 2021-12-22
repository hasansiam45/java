package polymorphism;

public class Triangle extends Shape{
    double length, width;

    Triangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        System.out.print("Triangle area = ");
        return length * width;
    }
}
