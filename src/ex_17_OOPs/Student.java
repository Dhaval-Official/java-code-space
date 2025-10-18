package ex_17_OOPs;

public class Student {

    String name;

    Student() {
        System.out.println("Student called");
    }

    Student(String name) {
        System.out.println("Student called that is named as "+name);
        this.name = name;
    }

    void sleep() {}
    void eat() {}
    void study() {
        System.out.println(this.name+" is Studying");
    }

}
