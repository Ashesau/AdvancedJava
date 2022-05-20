/**
 *  Реализовать метод, определяющий,
является ли одна строка перестановкой другой.
Под перестановкой понимаем любое изменение порядка символов.
Регистр учитывается, пробелы являются существенными. */

package AdvancedTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAnagram {
    public static String sort(String s) {
        char[] str = s.toCharArray();
        return new String(str);
    }

    public static boolean equalsString(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        return sort(one).equals(sort(two));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        boolean x = true;
        System.out.println("Введите строку:");

        string = bf.readLine();
        System.out.println("Введите другую строку:");

        String result = bf.readLine();
        String resultant = sort(string);
        if (x == equalsString(result, resultant)) {
            System.out.println("Строка" + " " + "(" + result + ")" + " является анаграммой строки" +
            " " + "(" + string + ")");
        }
        else {
            System.out.println("Извиняйте, анаграмма не найдена.");
        }
    }
}

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//    public static boolean equalsString(String one, String two) {
//        return stringToMap(one).equals(stringToMap(two));
//    }
//    public static Map<String, Integer> stringToMap(String w) {
//
//        Map<String, Integer> map = new HashMap<>();
//        for (String con1 : w.split(" ")) {
//            if (!map.containsKey(con1)) {
//                map.put(con1, 1);
//            } else {
//                map.replace(con1, 1 + map.get(con1));
//            }
//        }
//        return map;
//    }
//
//        public static void main(String[] args) {
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Напишите символы:");
//
//            String str = scan.nextLine();
//            System.out.println("Является перестановкой -  " +
//                    equalsString("hello", "hlleo"));
//            System.out.println("Разные символы - " +
//                    equalsString ("hello", "art"));
//        }
//}
