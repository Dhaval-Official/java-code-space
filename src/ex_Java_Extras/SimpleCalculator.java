package ex_Java_Extras;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        SimpleCalculator sc = new SimpleCalculator();

        System.out.println(a+" "+b);
        System.out.println(sc.addm(a,b));
        System.out.println(sc.sub(a,b));
        System.out.println(sc.mul(a,b));
        System.out.println(sc.div(a,b));
        System.out.println(sc.mod(a,b));


    }

    public int addm(int x, int y) {
        return x+y;
    }
    int sub(int x, int y) {
        return x-y;
    }
    int mul(int x, int y) {
        return x*y;
    }
    int div(int x, int y) {
        return x/y;
    }
    int mod(int x, int y) {
        return x%y;
    }

}
