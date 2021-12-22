package encapsulation;

public class TestEncap3 {
    public static void main(String[] args) {
        Encapsulation3 test1 = new Encapsulation3();
        test1.setValue("Hasan Siam", 25);
        System.out.println(test1.getName());
        System.out.println(test1.getAge());
    }
}
