package ex_04_Operators;

public class Lab026_interview_concat_plus {
    public static void main(String[] args) {

        int a=10,b=20;
        System.out.println(a+b);

        String s1 = "Dhaval", s2 = "Lakhani";
        System.out.println(s1 + s2 + a + b);
        System.out.println(a + b + s1 + s2);
        System.out.println(a + b + s1 + s2 + a + b);
        System.out.println(a + b + s1 + s2 + (a + b));
    }
}
