package access_modifier;

public class A {
    public void displayPublic () {
        System.out.println("I am public Method");
    }

    private void displayPrivate () {
        System.out.println("I am private method");
    }

    protected void displayProtected () {
        System.out.println("I am protected method");
    }

    void displayDefault () {
        System.out.println("I am default method");
    }
}
