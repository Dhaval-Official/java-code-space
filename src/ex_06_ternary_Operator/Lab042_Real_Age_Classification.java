package ex_06_ternary_Operator;

public class Lab042_Real_Age_Classification {

    public static void main(String[] myargs) {
        System.out.println("Code 3: Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator  ");


        String user_input = myargs[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        int age = Integer.parseInt(user_input);

        String result = age < 18 ? "Minor" : (age > 60) ? "Sr. Citizen" : "Adult";

        System.out.println("Classification by age "+age+" is "+result);

    }
}
