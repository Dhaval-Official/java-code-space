package ex_04_Operators;

public class Lab029_GATES {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(!  true);

        int sal = 12;
        boolean b = !(sal > 10 || sal < 5);
        System.out.println("sal "+b);
    }
}
