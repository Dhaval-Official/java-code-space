public class Test2 {
    public static void main(String[] args) {
        String s = "I am working on String";
        String[] tokens = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = tokens.length - 1; i >= 0; i--) {
            result.append(tokens[i]);
            if (i != 0) result.append(" ");
        }

        System.out.println(result.toString());
    }
}
