package ex_30_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab110_ArrayLists {
    public static void main(String[] args) {

        List li = new ArrayList<>();
        li.add("1");
        li.add("2");
        li.add("3");
        li.add("3");
        li.add(4);
        li.add(true);

        System.out.println(li.size());
        System.out.println(li.isEmpty());
        System.out.println(li.contains("1"));
        System.out.println(li.contains(1));
        System.out.println(li.indexOf("3"));
        System.out.println(li.lastIndexOf("3"));

        System.out.println(li);

        for (int i=0;i<li.size();i++) {
            System.out.print(li.get(i)+" ");
        }

        System.out.println("--------");

        for (Object i: li) {
            System.out.print(i+" ");
        }

        System.out.println("--------");

        Iterator it = li.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }



    }
}
