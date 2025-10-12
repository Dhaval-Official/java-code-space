package ex_15_String_Builder_Buffer;

public class Lab074_Palindrome {
    public static void main(String[] args) {

        String s = "asdfdsa";
        String sReverse = "";

        for (int i = s.length()-1; i > -1; i--) {
            sReverse += s.charAt(i);
        }

        if (s.equals(sReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}
