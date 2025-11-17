package ex_27_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab102_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("/home/dhaval/headfirstJava");    //   this location can't exist in windows;
    }
}
