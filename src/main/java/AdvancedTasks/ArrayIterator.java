/**
 * Написать итератор по массиву */

package AdvancedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayIterator {
    public static void main(String[] args) {
        Integer[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(nums));
        Iterator<Integer> numListIter = numList.iterator();

        while (numListIter.hasNext()) {
            int n = numListIter.next();
            if (n < 0) {
                numListIter.remove();
            }
        }
        System.out.println(numList);
    }
}

    //Iterator iter = list.iterator();
//Iterator<MyType> iter = list.iterator(); в J2SE 5.0
//while (iter.hasNext())
//        System.out.println(iter.next());


//public class ArraysIterator {
//
//    public static void main(String[] args) {
//
//        Integer[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int i : num) {
//            System.out.println(i);
//        }
//    }
//}