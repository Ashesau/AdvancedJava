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
        }
        System.out.println(numList);
    }
}