package AdvancedTasks;

import java.util.Arrays;

public class ArrayOfIntegers {

    public int[] foo(int[] numbers, int target) {
        Integer[] nums = {5, 3, 5, 1, 4, 2};
        System.out.println("Input: nums " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
            return new int[]{-1, -1};
        }
        return numbers;
    }
}
//    public static void main(String[] args){
//        int[] arr = {4, 1, 2, 4, 4, 2};
//        int x = 0;
//        System.out.println(Arrays.toString(foo(arr, x)));
//
//    }
//
//    public static int[] foo(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) return new int[]{i, j};
//            }
//        }
//        return new int[]{-1, -1};
//    }
