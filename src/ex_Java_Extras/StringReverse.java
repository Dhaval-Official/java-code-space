package ex_Java_Extras;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse");

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println(sb);
    }
}
