package ex_16_Arrays;

public class Lab075_Arrays {
    public static void main(String[] args) {
        String s = "Dhaval";
        String[] sArray = s.split("");
        for (String i: sArray) {
            System.out.println(i);
        }
    }
}
