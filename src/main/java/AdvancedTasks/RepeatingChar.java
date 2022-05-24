/**
 * Найти первый наиболее часто повторяющийся в строке символ */

package AdvancedTasks;

import java.util.*;

public class RepeatingChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split("");

        Map<String, Integer> h = new LinkedHashMap<String, Integer>();

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