package ex_27_Exceptions;

public class Lab106_Finally_Skipped {
    public static void main(String[] args) {


        System.out.println(callme());
    }

    static int callme() {
        try {
            int a = 10/10;
//            System.exit(0);
//            return 5;

        } catch (Exception e) {
            System.out.println("in catch");
        } finally {
            System.out.println("in finally");
        }

        return 0;
    }
}
