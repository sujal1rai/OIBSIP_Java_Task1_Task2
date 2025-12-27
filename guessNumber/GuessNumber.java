package guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        do{
            int num = random.nextInt(1,101);
            int count = 0;
            int guess;

            System.out.println("Guess the number between 1 - 100: ");

            do{
                guess = scanner.nextInt();
                count++;
                if(guess > num){
                    System.out.println("Too high");
                } else if(guess < num){
                    System.out.println("Too low");
                } else{
                    System.out.println("Correct!");
                    System.out.println("Attempts taken: " + count);
                }
            }while (guess != num);

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.next();

        }while (playAgain.equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
