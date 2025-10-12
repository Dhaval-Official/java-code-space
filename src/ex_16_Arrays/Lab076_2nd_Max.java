package ex_16_Arrays;

import java.util.Arrays;

public class Lab076_2nd_Max {
    public static void main(String[] args) {
//        int[] nums = {12,34,10,1,100,3,4,32,76,111};

        //easy way
//        Arrays.sort(nums);
//        System.out.println(nums[nums.length-2]);

        int[] nums2 = {12,34,10,1,100,3,4,32,76,111,110};

        int max = nums2[0] > nums2[1] ? nums2[0]: nums2[1];
        int max2 = nums2[0] < nums2[1] ? nums2[0]: nums2[1];

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > max) {
                max2 = max;
                max = nums2[i];
            } else if(nums2[i] > max2) {
                max2 = nums2[i];
            }
        }
        System.out.println(max2);


    }
}
