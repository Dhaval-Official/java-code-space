package ex_Java_Tasks.Task_10_Oct;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int num2 = sc.nextInt();

        int maxNum = Math.max(num1, num2);

        System.out.println(maxNum);
    }
}
