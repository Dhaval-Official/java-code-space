package ex_20_OOPs_Polymorphism;

public class Lab090_RunTime  {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.home();

        Father f1 = new Father();       //dynamic dispatch
        f1.home();

        Son2 f = new Son2();
        f.home(2);
    }
}

class Father{
    void home() {
        System.out.println("2BHK");
    }
}

class Son extends Father{
    @Override
    void home() {
        System.out.println("3BHK");
    }
}

class Son2 extends Father{
    void home(int num) {
        System.out.println(num+" 3BHKs");
    }
}