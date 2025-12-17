// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        //Problem 1
        System.out.println("Problem 1");

        int[][] input1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] output1 = merge(input1);
        System.out.print("Output1: ");
        display(output1);

        int[][] input2 = {{1,4},{4,5}};
        int[][] output2 = merge(input2);
        System.out.print("Output2: ");
        display(output1);

        int[][] input3 = {{1,3},{5,7}};
        int[][] output3 = merge(input3);
        System.out.print("Output3: ");
        display(output3);

        //Problem 2
        System.out.println("\nProblem 2");

        System.out.println("Output1: "+countAnagramSubstrings("cbaebabacd","abc"));
        System.out.println("Output2: "+countAnagramSubstrings("aaaaa","aa"));
        System.out.println("Output3: "+countAnagramSubstrings("abab","ab"));

    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int[][] result = new int[n][2];
        int index = 0;

        // Initialize first interval
        result[index][0] = intervals[0][0];
        result[index][1] = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= result[index][1]) {
                // Ternary instead of Math.max
                result[index][1] = (result[index][1] > intervals[i][1] )? result[index][1] : intervals[i][1];
            } else {
                index++;
                result[index][0] = intervals[i][0];
                result[index][1] = intervals[i][1];
            }
        }

        // Manual trim instead of Arrays.copyOf
        int[][] finalResult = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static int countAnagramSubstrings(String s, String p) {

        HashMap<Character, Integer> miniMap = new HashMap<Character, Integer>();
        int temp;
        int sLength = s.length();
        int pLength = p.length();
        String tempStr;
        int anagramsCaught = 0;
        HashMap<Character, Integer> tempMap;

//        if(s.length() == p.length()) {
//            if(isAnagram(miniMap,p)) {
//                return 1;
//            }
//            return 0;
//        }

        for (int i = 0; i < pLength; i++) {
            if(miniMap.containsKey(p.charAt(i))) {
                temp = miniMap.get(p.charAt(i));
                miniMap.put(p.charAt(i),++temp);
            } else {
                miniMap.put(p.charAt(i),1);
            }
        }

        for(int i=0;i<sLength-pLength+1;i++) {

            tempStr = s.substring(i, i+pLength);
            tempMap = new HashMap<>(miniMap);
            if(isAnagram(tempMap,tempStr)) {
                anagramsCaught++;
            }

        }

        return anagramsCaught;
    }

    public static boolean isAnagram(HashMap<Character, Integer> minMap, String p) {

        int temp;
        for (int i = 0; i < p.length(); i++) {
            if(minMap.containsKey(p.charAt(i))) {
                temp = minMap.get(p.charAt(i));
                if(temp == 1) {minMap.remove(p.charAt(i));
                } else {
                minMap.put(p.charAt(i), --temp);
                }
            } else {
                return false;
            }
        }


        return true;
    }

    public static void display(int[][] solution) {

        for (int i = 0; i < solution.length; i++) {

            System.out.print("["+solution[i][0]+", "+solution[i][1]+"] ");

        }
        System.out.println();
    }

}