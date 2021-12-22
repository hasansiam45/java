package staticMethod;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id = 8;
        name = "Siam";
    }

    static void display(){
        System.out.println("Id = "+ id);
        System.out.println("Name = "+ name);
    }
}
