package abstraction;

public class TestAbstrction {
    public static void main(String[] args) {
        User p; // create a reference of abstract class User in p;
        p = new Siam(); // reference of siam stored in p;
        p.sendMsg();  // Hi, I am Siam;
        p.call("Irin");  // Calling Irin....
        p = new Jahid();  // reference of jahid stored in p;
        p.sendMsg();  // Hi, I am Jahid;
        p.call("Srabony");  // Calling Srabony....
    }
}
