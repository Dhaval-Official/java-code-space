package ex_26_Wrappers;

public class Lab099_Wrappers {
    public static void main(String[] args) {
        Integer a1 = 10;
        System.out.println(a1);
        System.out.println(a1.intValue());
        System.out.println(Integer.MAX_VALUE);

        String s = "101";
        Integer i = Integer.parseInt(s);

        System.out.println(s);
        System.out.println(i);


    }
}

class A {
    Integer rollno;
    String name;
}