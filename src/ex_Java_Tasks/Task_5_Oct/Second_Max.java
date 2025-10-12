package ex_Java_Tasks.Task_5_Oct;

public class Second_Max {
    public static void main(String[] args) {
        int[] nums2 = {12,34,10,1,100,3,4,32};

        int max = 0;
        int max2 = 0;

        for (int i : nums2) {
            if (i > max) {
                max2 = max;
                max = i;
            } else if (i > max2 && i != max) {
                max2 = i;
            }
        }
        System.out.println(max2);
    }
}
