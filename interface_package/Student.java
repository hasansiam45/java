package interface_package;

public class Student implements Person,Man{

    public void eat() {
        System.out.println("Student loves to eat " + fav_food);
    }


    public void display() {
        System.out.println("Student Name is = " + name);
    }


    public void address() {
        System.out.println("Student address is = " + add);
    }


    public void attitude() {
        System.out.println("Student is = "+ behave);
    }


    public void income() {
        System.out.println("Student income is = "+ salary);
    }

    void allInfo () {
        this.display();
        this.address();
        this.eat();
        this.attitude();
        this.income();
    }
}
