package randomPackage;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's Start a game!\nWe have a random number from 1 -10.\nYou have 5 chances.\nIf You can't answer on these five chances you will loose!\nLet's see your score.");
        System.out.print("Are you ready? Yes or no: ");
        String ans1 = input.next();
        String lowerAns = ans1.toLowerCase();

        if (lowerAns.equals("yes")){
            Random rand = new Random();
            int randomNumber = rand.nextInt(10) + 1;
            int correctAns = 0;
            int score = 5;

            System.out.println("Supperb! Now start the game. Guess what can be the number from 1 to 10");
            for (int i = 1; i < 6 ; i++) {
                int guessing = input.nextInt();
                if(guessing == randomNumber){
                    System.out.println("Hurray You have Wined!");
                    System.out.println("Score = "+ score);
                    correctAns++;
                    break;
                }else{
                    if(score == 1){
                        System.out.println("Failed!");
                        score --;
                    }else{
                        System.out.println("Opps! Doesn't match. Try again!");
                        score --;
                    }
                }
            }
            if(correctAns == 0){
                System.out.println("You have Lost the game!");
                System.out.println("Your Score = " + score);
            }
        }else{
            System.out.println("oh no! Be brave man!");
        }
    }
}
