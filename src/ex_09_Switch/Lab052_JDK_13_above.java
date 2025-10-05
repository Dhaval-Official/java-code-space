package ex_09_Switch;

import java.util.Scanner;

public class Lab052_JDK_13_above {
    public static void main(String[] args) {
        int code = 1;

        switch (code) {
            case 1 -> System.out.println("001");
            case 2 -> System.out.println("002");
            case 3 -> System.out.println("003");
            default -> System.out.println("default");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            switch (num) {
                case 1,3,5,7: System.out.println("odd");
                    break;
                case 2, 4, 6, 8: System.out.println("even");
                    break;

                default: System.out.println("Invalid, day number");

            }
        } else {
            System.out.println("Enter an Integer");
        }

    }
}
