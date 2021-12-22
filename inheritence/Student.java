package inheritence;

public class Student extends BaseClass1 {
    int roll;
    void displayInfo2 () {
        displayInfo();
        System.out.println("Roll = "+ roll);
        System.out.println("Height = " + getHeight());
    }
}
