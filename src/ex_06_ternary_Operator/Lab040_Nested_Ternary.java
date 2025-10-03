package ex_06_ternary_Operator;

public class Lab040_Nested_Ternary {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int age = 21;

        String result = (age > 18) ? (age > 25) ? "you can go to casino":"you cannot go to casino": "you cannot go to goa";

    }
}
