package ex_15_String_Builder_Buffer;

import java.util.Scanner;

public class Lab073_manual_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");

        StringBuilder sb = new StringBuilder(sc.next());
//        System.out.println(sb.reverse());

        //method1
        String ans = "";
        for (int i = sb.length()-1; i > -1; i--) {
            ans += sb.charAt(i);
        }
        System.out.println("ans in String: "+ans);

        //method2
        StringBuilder ans1 = new StringBuilder();
        for (int i = sb.length()-1; i > -1; i--) {
            ans1.append(sb.charAt(i));
        }
        System.out.println("ans in StringBuilder: "+ans1);

        //method3
        char[] ip2 = sb.toString().toCharArray();
        String ans2 = "";
        for (int i = ip2.length-1; i > -1; i--) {
            ans2 += ip2[i];
        }
        System.out.println("ans in char array: "+ans2);

    }
}
