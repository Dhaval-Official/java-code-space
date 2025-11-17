package ex_24_Static;

public class Lab094_Static_SIB {
    public static void main(String[] args) {
//        A a = new A();
        A.m1();
    }
}

class A {
    static {
        System.out.println("I am in static block");
        System.out.println("you can write a code reading a excel, file etc");
    }
    static int a = 10;

    static void m1() {
        System.out.println("Static method");
    }
}
