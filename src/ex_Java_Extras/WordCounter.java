package ex_Java_Extras;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

    }
}
