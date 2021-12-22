package randomPackage;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(5) + 1;  // 1 - 5
//        System.out.println(randomNumber);

        randomNumber = rand.nextInt(2) + 8;  // 8 - 9
//        System.out.println(randomNumber);

        randomNumber = rand.nextInt(6) + 10; // 10 - 15
        System.out.println(randomNumber);

    }
}
