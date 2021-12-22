package superKeyword;

public class TestSuper {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Red", 250.5);
        Car c1 = new Car("Black", 200.5, 50);

        v1.attribute();
        c1.attribute();
    }
}
