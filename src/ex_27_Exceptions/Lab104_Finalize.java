package ex_27_Exceptions;

public class Lab104_Finalize {
    public static void main(String[] args) {
        Lab104_Finalize lf = new Lab104_Finalize();
        lf = null;
        System.gc();
        System.out.println("Main method Done");
    }

    @Override
    public void finalize() {            //this is depreciated
        System.out.println("Finalize called before GC");
    }
}
