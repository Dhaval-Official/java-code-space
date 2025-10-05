package ex_14_Strings;

public class Lab065_String_Areas {
    public static void main(String[] args) {

        //1
        //these Strings live in SCP
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = "Hello";
        String s5 = "hello";

        //all s1 -> s4 refer to 1 String only in SCP
        //there are total 2 strings in SCP now

        //2
        //these Strings live in Heap area
        String s6 = new String("Hello");
        String s7 = new String("Hello");
        String s8 = new String("Hello");

        //s6, s7, s8 refer to different Strings here
        //there are total 3 strings in Object area now

    }
}
