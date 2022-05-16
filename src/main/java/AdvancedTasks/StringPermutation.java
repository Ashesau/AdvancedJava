package AdvancedTasks;

import java.util.HashMap;
import java.util.Map;

    public class StringPermutation {

        public static boolean equalsString(String w1, String w2) {
            return stringToMap(w1).equals(stringToMap(w2));
        }

        public static Map<String, Integer> stringToMap(String w) {
            Map<String, Integer> map = new HashMap<>();
            for (String s : w.split("")) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.replace(s, 1 + map.get(s));
                }
            }
            return map;
        }

        public static void main(String[] args) {

            System.out.println(equalsString("hello", "hlleo"));
            System.out.println(equalsString("hello", "art"));
        }
    }
