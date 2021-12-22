package varLengthArgs;

public class AddDemo {
    int sum = 0;
    void add (int ... num) {
        for (int x : num) {
            sum += x;
        }
        System.out.println("Sum = "+ sum);
    }
}
