package ex_Java_Extras;

import java.util.Hashtable;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
        int count;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter First word");
        String w1 = sc.nextLine();

        System.out.println("Enter Second word");
        String w2 = sc.nextLine();

        for (int i = 0; i < w1.length(); i++) {
//            System.out.println(w1.charAt(i));

            if(ht.contains(w1.charAt(i))) {
                count = (int) ht.get(w1.charAt(i));
                ht.put(w1.charAt(i),++count);
            } else {
                ht.put(w1.charAt(i),1);
            }
        }


        for (int i = 0; i < w1.length(); i++) {
            System.out.println(w1.charAt(i));

            if(ht.contains(w1.charAt(i))) {
                count = (int) ht.get(w1.charAt(i));
                ht.put(w1.charAt(i),++count);
            } else {
                ht.put(w1.charAt(i),1);
            }
        }




    }
}
