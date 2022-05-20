/**
 *  Написать метод, который будет подсчитывать
количество цифр «2», используемых в десятичной
записи целых чисел от 0 до n (включительно) */

package AdvancedTasks;

import java.util.Scanner;

public class CountingNumbers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        long count = scan.nextLong();
        String str = Long.toString(count);
        String[] s = str.split("");
        int total = 0;
        String numberOf2s = "2";

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(numberOf2s)) {
                total++;
            } else continue;
        }
        System.out.println("Число 2 повторяется " + total + " раза");
    }
}