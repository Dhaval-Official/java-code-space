package ex_04_Operators;

public class Lab022_Operators_Unary {
    public static void main(String[] args) {
        //Unary: works on single literal

        int a = +10;
        System.out.println("a: "+a);

        int b = -10;
        System.out.println("b: "+b);

        int c = ++a;
        System.out.println("c: "+c);

        int d = --b;
        System.out.println("d: "+d);

        int e = c++;
        System.out.println("e: "+e);

        int f = d--;
        System.out.println("f: "+f);

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("e: "+e);
        System.out.println("f: "+f);

    }
}
