package ex_27_Exceptions;

import java.util.Scanner;

public class Lab105_ThrowExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        validate_age_for_club(age);
    }

    static void validate_age_for_club(int age) throws Exception {
        if(age > 18) {
            throw new Exception("Age can't be less than 2");
        } else {
            System.out.println("Enjoy clubbing");
        }
     }
}
