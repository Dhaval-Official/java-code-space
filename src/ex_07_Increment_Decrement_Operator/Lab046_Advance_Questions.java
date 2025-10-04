package ex_07_Increment_Decrement_Operator;

public class Lab046_Advance_Questions {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a++ + a);        //internally 10(post increment) + 11(value of a is incremented now)

        int b = 10;
        System.out.println(b++ + ++b);

        int c = 10;
        System.out.println(++c + ++c);



    }
}
