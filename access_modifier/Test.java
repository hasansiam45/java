package access_modifier;

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.displayPublic();
//        obj.displayPrivate();  //'displayPrivate()' has private access in 'access_modifier.A'
        obj.displayProtected();  // only available in same package; for using another package then need to inherit using extends;
        obj.displayDefault();  // only available in same package;
    }
}
