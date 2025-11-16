package ex_24_OOPs_Abstraction;

public class Lab093_InterviewQ {
    public static void main(String[] args) {
        test3 t3 = new test3();
        t3.display();

        A1 a1 = new A1();
        a1.disp();
    }
}

interface I1{
    int a = 10;
}
interface I2 extends I1 {
    int a1 = 20;
    final int b = 20;   //final will be ignored
    static void displayer() {
        System.out.println("Hello");
    }
}

abstract class AA1 {
    AA1() {
        System.out.println("AA1 abstract constructor");
    }
}

class A1 extends AA1{
    void disp() {
        System.out.println("disp method");
    }
}
class B1{}

class test3 implements I1, I2 {
    public void display() {
        System.out.println(I1.a);
        System.out.println(I2.a);
    }
}