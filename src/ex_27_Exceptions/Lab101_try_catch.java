package ex_27_Exceptions;

public class Lab101_try_catch {
    public static void main(String[] args) {

        String s = null;

        try {
            s.trim();
        } catch (RuntimeException e) {
            System.out.println("cannot trim null");
        }

        int a = 0;
        int b;

        try {
            b = 10/a;
        } catch (ArithmeticException e) {
            System.out.println("caught arithmetic");
        } catch (Exception e) {
            System.out.println("caught normal");        //big basket
        } catch (Throwable e) {
            System.out.println("Caught throwable");     //bigger basket
        }

    }
}
