/**
 * Найти первый наиболее часто повторяющийся в строке символ */

package AdvancedTasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split("");

        Map<String, Integer> h = new HashMap<String, Integer>();

        for (int i = 0; i < s.length; i++) {
            if (h.containsKey(s[i])) {
                h.replace(s[i], h.get(s[i]) + 1);
            } else {
                h.put(s[i], 1);
            }
        }

        int maxVal = Collections.max(h.values());
        String chr = "";

        for (String l : h.keySet()) {
            if (h.get(l).equals(maxVal)) {
                chr = l;
                break;
            }
        }
        System.out.println("Наиболее часто повторяющийся символ " + chr + ", появляется " + maxVal + " раз");
    }
}
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        System.out.println ("Исходный символ: " + str);
//
//        Scanner s1 = new Scanner(System.in);
//        System.out.print ("Введите символ, который хотите найти:\n");
//        char ch = s1.next (). charAt (0);
//        s1.close();
//
//        int i, sum = 0;
//        for ( i = 0 ; i < str.length() ; i++) {
//            if ( str.charAt(i) == ch )
//                ++ sum;
//        }
//        System.out.print ("Наиболее часто повторяющийся символ " + ch +
//                " появляется в строке " + sum + " раз\n");
//    }
//}
