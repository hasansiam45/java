package inheritence;

public class TestAll {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Person p1 = new Person();
        Teacher t1 = new Teacher();

        a1.name = "Cow";
        a1.age = 5;
        a1.weight = 150;
        a1.color = "Red";

        p1.name = "Hasan";
        p1.age = 25;
        p1.color = "White";
        p1.weight = 71.5;
        p1.qualification = "Bsc";

        t1.name = "Sojib";
        t1.age = 30;
        t1.weight = 68.5;
        t1.color = "White";
        t1.qualification = "Msc";
        t1.salary = 30000;

        a1.display();
        p1.display();
        t1.display();

//        System.out.println(a1 instanceof Person); // false
//        System.out.println(p1 instanceof Animal);  // true
    }
}
