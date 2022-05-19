/* Дан массив целых чисел nums.
Пара (i,j) называется идентичной, если nums[i] == nums[j] и i < j.
Необходимо вычислить количество идентичных пар */

package AdvancedTasks;

import java.util.HashMap;
import java.util.Map;

public class IdenticalPairs {

    public static int numberOfIdenticalPairs(int[] nums) {

        Map<Integer, Integer> ran = new HashMap<>();

        int pairs = 0;
        for (int i : nums) {
            int top = ran.getOrDefault(i, 0);
            pairs += top;
            ran.put(i, top + 1);
        }
        return pairs;
    }
        public static void main(String[] args) {

        int[] nums = {1,4,3,6,7,8,4,3,9,8,4,5};

            System.out.println(numberOfIdenticalPairs(nums));
        }
}