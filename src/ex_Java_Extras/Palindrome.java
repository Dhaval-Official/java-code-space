package ex_Java_Extras;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.nextLine());
        StringBuffer s1 = new StringBuffer(s);
        StringBuffer s2 = s.reverse();

        System.out.println(s1 +" "+s2 +" "+s);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


    }
}
