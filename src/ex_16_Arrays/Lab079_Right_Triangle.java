package ex_16_Arrays;

import java.util.Scanner;

public class Lab079_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle you want");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(i+j >= height-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
