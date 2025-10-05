package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab059_Number_guessing {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
//        System.out.println(numberToGuess);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true) {
            if(!sc.hasNextInt()) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if(guess < 1 || guess > 100) {
                System.out.println("Enter a number from 1 to 100");
                continue;
            }

            if(guess > numberToGuess) System.out.println("Too High, try again");
            else if (guess < numberToGuess) System.out.println("Too Low, try again");
            else {
                System.out.println("correct you were able to find in "+attempts+" attempts");
                break;
            }



        }
    }
}
