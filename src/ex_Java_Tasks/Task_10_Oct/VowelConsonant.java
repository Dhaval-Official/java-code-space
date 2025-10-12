package ex_Java_Tasks.Task_10_Oct;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character ");

        String s = sc.nextLine();
        char character = s.charAt(0);

        switch (character) {
            case'a','e','i','o','u','A','E','I','O','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }

    }
}
