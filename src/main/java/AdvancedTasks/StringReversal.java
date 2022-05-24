/**
 *  Реализовать метод, определяющий,
является ли одна строка перестановкой другой.
Под перестановкой понимаем любое изменение порядка символов.
Регистр учитывается, пробелы являются существенными. */

package AdvancedTasks;

import java.util.Arrays;
import java.util.Scanner;

public class StringReversal {

    static Scanner scan = new Scanner(System.in);
    static String one;
    static String two;
    static boolean x = true;

    public static String string1() {
        char[] s_array1 = one.toCharArray();
        Arrays.sort(s_array1);
        return new String(s_array1);
    }

    public static String string2() {
        char[] s_array2 = two.toCharArray();
        Arrays.sort(s_array2);
        return new String(s_array2);
    }

    public static void equalsString() {
        System.out.println("Ввести первую строку: ");
        one = scan.nextLine();
        System.out.println("Ввести вторую строку: ");
        two = scan.nextLine();
        if (one.length() == two.length()) {
            if (string1().equals(string2())) {
                x = true;
            } else {
                x = false;
            }
        } else {
            x = false;
        }
        if (x == true) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Совпадений не найдено");
        }
        scan.close();
    }
    public static void main(String[] args) {
        StringReversal.equalsString();
    }
}