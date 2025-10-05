package ex_12_DoWhile;

public class Lab060_doWhile {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("body");
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
