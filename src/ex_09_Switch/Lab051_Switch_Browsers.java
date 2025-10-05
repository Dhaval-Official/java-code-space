package ex_09_Switch;

import java.util.Scanner;

public class Lab051_Switch_Browsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your browser");

        if(sc.hasNextLine()) {
            String browser = sc.nextLine();
            switch (browser) {
                case "Chrome":
                    System.out.println("Chrome");
                    break;
                case "Edge":
                    System.out.println("Edge");
                    break;
                case "firefox":
                    System.out.println("firefox");
                    break;
                default: System.out.println("System browser");
            }
        }
    }
}
