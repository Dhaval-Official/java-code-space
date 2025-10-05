package ex_10_For_Loop;

public class Lab056_ForLoop_EvenNums_Strange {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i%2 ==1) {
                continue;
            }
            System.out.println(i);
        }
    }

}
