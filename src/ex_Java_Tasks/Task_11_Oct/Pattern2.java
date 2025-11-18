package ex_Java_Tasks.Task_11_Oct;

public class Pattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for (int j=5;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
