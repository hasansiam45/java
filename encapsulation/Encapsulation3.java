package encapsulation;

public class Encapsulation3 {
    private String name;
    private int age;

    public void setValue (String n, int a) {
        name = n;
        age = a;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
}
