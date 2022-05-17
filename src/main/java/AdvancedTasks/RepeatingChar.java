/* Найти наиболее часто повторяющийся в строке символ */

package AdvancedTasks;

import java.util.Scanner;

public class RepeatingChar {

    public static void main(String[] args) {

        String str = "aabcccccaaa";
        System.out.println ("Исходный символ: " + str);

        Scanner sc = new Scanner(System.in);
        System.out.print ("Введите символ, который хотите найти:\n");
        char ch = sc.next (). charAt (0);
        sc.close();
        int i, sum = 0;

        for ( i = 0 ; i < str.length() ; i++) {

            if ( str.charAt(i) == ch )
                ++ sum;
        }
        System.out.print ("Наиболее часто повторяющийся символ " + ch + " появляется в строке " + sum + " раз\n");
    }
}
