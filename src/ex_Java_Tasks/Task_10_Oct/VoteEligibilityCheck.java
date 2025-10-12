package ex_Java_Tasks.Task_10_Oct;

import java.util.Scanner;

public class VoteEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();

        if(age > 17) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote, comeback later");
        }


    }
}
