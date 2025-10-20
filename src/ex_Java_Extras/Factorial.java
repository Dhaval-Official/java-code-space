package ex_Java_Extras;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = num;

        while (num >1 ) {

            num--;
            fact*=num;

        }

        System.out.println(fact);
    }
}
