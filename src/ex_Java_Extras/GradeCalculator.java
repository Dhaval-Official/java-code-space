package ex_Java_Extras;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numerical score");


        if (sc.hasNextInt()) {
            int score = sc.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("Enter in range of 1 to 100");
            } else if (score > 89) {
                System.out.println("Garde A");
            } else if (score > 79) {
                System.out.println("Garde B");
            } else if (score > 69) {
                System.out.println("Garde C");
            } else if (score > 59) {
                System.out.println("Garde D");
            } else {
                System.out.println("Grade F");
            }

        } else {
            System.out.println("You Fool!!! Enter a Integer Value");
        }
    }
}
