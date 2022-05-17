/* Реализовать метод, определяющий,
является ли одна строка перестановкой другой.
Под перестановкой понимаем любое изменение порядка символов.
Регистр учитывается, пробелы являются существенными. */

package AdvancedTasks;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

    public static boolean equalsString(String one, String two) {
        return stringToMap(one).equals(stringToMap(two));
    }
    public static Map<String, Integer> stringToMap(String w) {

        Map<String, Integer> map = new HashMap<>();
        for (String con1 : w.split(" ")) {
            if (!map.containsKey(con1)) {
                map.put(con1, 1);
            } else {
                map.replace(con1, 1 + map.get(con1));
            }
        }
        return map;
    }

        public static void main(String[] args) {

            System.out.println("Является перестановкой - hello & hlleo " + "(" +
                    equalsString("hello", "hlleo") + ")");
            System.out.println("Разные символы - hello & art " + "(" +
                    equalsString ("hello", "art") + ")");
        }
    }
