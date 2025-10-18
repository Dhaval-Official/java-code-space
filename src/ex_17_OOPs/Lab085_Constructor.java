package ex_17_OOPs;

public class Lab085_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "D1";
        Student s2 = new Student("D2");

        System.out.println(s1.name);
        System.out.println(s2.name);

        s1.study();
        s2.study();
    }
}
