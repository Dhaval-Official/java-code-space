package ex_07_Increment_Decrement_Operator;

public class Lab045_Dec_Operator {
    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 10;

        //Pre Increment
        int b = --a1;
        System.out.println(a1);
        System.out.println(b);
        System.out.println();

        //Post Increment
        int c = a2--;
        System.out.println(a2);
        System.out.println(c);



    }
}
