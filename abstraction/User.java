package abstraction;

public abstract class User {
    void call (String name){
        System.out.println("Calling " + name + "....");
    }
    abstract void sendMsg();
}
