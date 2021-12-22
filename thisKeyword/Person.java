package thisKeyword;

public class Person {
    String name;
    double height;
    int age;
    String hairColor;

    Person (String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    Person (String name, double height, int age, String hairColor) {
        this(name, height, age);
        this.hairColor = hairColor;
    }

    void display () {
        System.out.println();
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Height = " + height);
        if(hairColor == null){
            System.out.println("Hair = Takla");
        }else{
            System.out.println("Hair = " + hairColor);
        }
    }


}
