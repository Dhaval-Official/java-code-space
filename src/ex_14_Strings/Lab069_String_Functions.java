package ex_14_Strings;

public class Lab069_String_Functions {
    public static void main(String[] args) {

        String s1 = "Java".substring(2);
        System.out.println(s1);

        String s2 = "Java".substring(1,3);
        System.out.println(s2);

        char[] s3 = "Java".toCharArray();
        System.out.println(s3);

        String s4 = "Java ".trim();
        System.out.println(s4);

        boolean b = "  ".isBlank();
        System.out.println(b);

        String s5 = "java".repeat(3);                               //this is new
        System.out.println(s5);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        int result = "abxD".compareTo("abc");
        System.out.println(result);

        String s6 = String.join("-x","Java","Python","c++");    //concat + elimeter
        System.out.println(s6);     //op is Java-xPython-xc++

        boolean b1 = "java".startsWith("Ja");
        System.out.println(b1);


    }
}
