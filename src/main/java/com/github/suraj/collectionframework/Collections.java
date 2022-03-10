package com.github.suraj.collectionframework;
import java.util.*;
/**
 * @author 08-03-2022
 */

public class Collections {
    public static void main(String args []) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));
        list.add(0, 0);
        System.out.println(list.get(0));
        System.out.println(list);
        list.set(5,6);
        System.out.println(list);
        System.out.println(list.size());

        // Iterations or using loops in array list

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
        s1.add(0);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.pop();
        s1.pop();
        System.out.println(s1);
    }
}
