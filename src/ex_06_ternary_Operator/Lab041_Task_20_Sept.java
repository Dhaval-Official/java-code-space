package ex_06_ternary_Operator;

public class Lab041_Task_20_Sept {

    public static void main(String[] args) {

        System.out.println("Code 1: Check if the number is even or odd by using Ternary Operator.  (Notepad).");

        int num1 = 5;

        String EvenOrOdd = num1%2==0 ? "Even" : "Odd";
        System.out.println("Number is "+EvenOrOdd);
        System.out.println();

        System.out.println("Code 2:  Interview - Zeta → (AT) Ter nested → Max between 3 number");

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3) ;

        System.out.println("Max number amoung 3 is "+max);
        System.out.println();

        System.out.println("Code 3: Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator  ");

        int age = 59;
        String classification = age < 18 ? "Minor" : (age > 60) ? "Sr Senior" : "Adult";

        System.out.println("Classification by age "+age+" is "+classification);
        System.out.println();


    }

}
