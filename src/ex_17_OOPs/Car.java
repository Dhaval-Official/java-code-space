package ex_17_OOPs;

//Constructor Chaining

public class Car {
    String model;
    int year;

    Car() {
        model = "XXXX";
        year = 1900;
        System.out.println("Default Car");
    }

    Car(String modelName, int yearCreated) {
        this("i10");
        this.year = yearCreated;
    }

    Car(String modelName) {
        this.model = modelName;
    }
}
