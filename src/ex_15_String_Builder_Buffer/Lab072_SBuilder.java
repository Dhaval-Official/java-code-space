package ex_15_String_Builder_Buffer;

public class Lab072_SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(23.43f);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Java");
        sb1.append(" Pgmg");

        sb1.replace(0,4,"C++");
        System.out.println(sb1);
    }
}
