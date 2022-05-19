///* Дан массив целых чисел nums.
//Пара (i,j) называется идентичной, если nums[i] == nums[j] и i < j.
//Необходимо вычислить количество идентичных пар */

package AdvancedTasks;

import java.util.Scanner;

public class IdenticalPairs {

    public static void numberOfIdenticalPairs() {
        int [] nums;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int x = sc.nextInt();
        nums = new int[x];
        for(int s = 1; s <= x; s++){
            System.out.print("Enter : ");
            nums[s-1] =sc.nextInt();
        }
        int i = 0;
        int j = 1;
        int count = 0;
        for(i = 0; i < nums.length; i++) {
            for(j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j );
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        IdenticalPairs.numberOfIdenticalPairs();
    }
}