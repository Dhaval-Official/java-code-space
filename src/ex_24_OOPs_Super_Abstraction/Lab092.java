package ex_24_OOPs_Super_Abstraction;

public class Lab092 {
}

abstract class AmitFather {
    abstract void loan50K();
    void loan10K(){
        System.out.println("Given");
    }
}

class AmitSone extends AmitFather {
    @Override
    void loan50K() {
        System.out.println("Completing abstract method of parent class");
    }
}

