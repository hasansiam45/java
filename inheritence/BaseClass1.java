package inheritence;

public class BaseClass1 {
    int age;
    String name;
    String address;
    private double height;

    void displayInfo () {
        System.out.println("My Name is = " + name);
        System.out.println("My Age is = " + age);
        System.out.println("My Address is = " + address);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
