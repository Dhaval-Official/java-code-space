package ex_Java_Tasks.Task_5_Oct;

import java.util.Scanner;

public class String_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");

        String s = sc.nextLine();

        String_Operations so = new String_Operations();

        //Write a program to reverse a string without using inbuilt functions.
        System.out.println(so.reverseMe(s));

        //Count the Number of Words in a String.
        System.out.println(so.numberOfWords(s));

        //First Letter of Each Word in a String.
        System.out.println(so.FirstLetterOfEachWord(s));

    }

    String reverseMe(String str) {
        String rs = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rs = rs + str.charAt(i);
        }

        return rs;
    }

    int numberOfWords(String str) {

        String[] words = str.split(" ");
        return  words.length;
    }

    String FirstLetterOfEachWord(String str) {

        String firstLetters = "";
        String[] words = str.split(" ");
        for (String word: words) {
            firstLetters = firstLetters + word.charAt(0);
        }
        return  firstLetters;
    }




}
