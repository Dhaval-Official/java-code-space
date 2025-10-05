package ex_10_For_Loop;

import java.util.Scanner;

public class Lab057_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        if(n == 0) System.out.println(0+" "+1);

        for (int i = 1; i <= n; i++) {

            fact *= i;
            System.out.println(i+" "+fact);

        }
    }
}
