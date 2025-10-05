package ex_13_Functions;

import java.util.Scanner;

public class Lab063_Function_Arith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = readInt(sc, "Enter the num1");
        int b = readInt(sc, "Enter the num2");

        System.out.println(sum(a,b));
        System.out.println(sub(a,b));


    }

    static int readInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Enter int value only");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return a-b;
    }

}
