package ex_Java_Tasks.Task_10_Oct;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");

        int num = sc.nextInt();

        String result = num %2 == 0 ? "Even" : "Odd";

        System.out.println("Number is "+result);

    }
}
