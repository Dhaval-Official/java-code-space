package ex_03_Literals;

public class Lab013_Constants {
    public static void main(String[] args) {

        final int a = 10;

//        a = 11;
        System.out.println(a);
    }

    public static class Lab014_Local_Variable {
        public static void main(String[] args) {
            int a = 10;
            int b = 23;
            int $ = 90;
    //        int _ = 12; works in jdk 21++
        }
    }

    public static class Lab015_Final {

        public static void main(String[] args) {
            final int a = 10;

    //        a = 11;
            System.out.println(a);
        }

    }
}
