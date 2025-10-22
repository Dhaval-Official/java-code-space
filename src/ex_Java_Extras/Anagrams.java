package ex_Java_Extras;

import java.util.Hashtable;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
        int count;
        boolean isAnagram = true;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter First word");
        String w1 = sc.nextLine();

        System.out.println("Enter Second word");
        String w2 = sc.nextLine();

        for (int i = 0; i < w1.length(); i++) {
//            System.out.println(w1.charAt(i));

            if(ht.contains(w1.charAt(i))) {
                count = ht.get(w1.charAt(i));
                ht.put(w1.charAt(i),++count);
            } else {
                ht.put(w1.charAt(i),1);
            }
        }

        System.out.println();

        for (int i = 0; i < w2.length(); i++) {
//            System.out.println(w2.charAt(i));
            if(ht.containsKey(w2.charAt(i))) {
                count = ht.get(w2.charAt(i));
                if(count-1 == 0) {
                    ht.remove(w2.charAt(i));
                } else {
                    ht.put(w2.charAt(i), --count);
                }
            } else {
//                System.out.println("Not Matched");
                isAnagram = false;
                break;
            }

        }

        isAnagram = ht.isEmpty() ? true : false;
        System.out.println(isAnagram ? "it is an Anagram": "it is not an Anagram");

    }
}
