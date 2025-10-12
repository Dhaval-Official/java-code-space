package ex_16_Arrays;

public class Lab081_2nd_Highest {
    public static void main(String[] args) {
        int[] nums = {12,45,67,23,89,45,89};

        int max = 0, max2 = 0;

        for (int num : nums) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2 && num!= max) {
                max2 = num;
            }
        }
        System.out.println(max2);
    }
}
