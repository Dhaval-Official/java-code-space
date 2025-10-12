package ex_16_Arrays;

import java.util.Scanner;

public class Lab077_Left_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle you want");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
