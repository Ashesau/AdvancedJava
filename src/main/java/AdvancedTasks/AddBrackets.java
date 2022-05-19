/* Дана строка, содержащая только английские
буквы (большие и маленькие). Добавить открывающиеся и закрывающиеся
скобки по следующему образцу:
"example" -> "(e(x(a(m)p)l)e)" */
package AdvancedTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class AddBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Впиши любое число или строку:");

        String w = s.nextLine();
        String[] str = w.split("");
        s.close();

        float num = Math.round(str.length / 2);
        List list = new LinkedList();
        List list2 = new LinkedList();

        for (int i = 0; i < str.length; i++) {
            if (i <= num) {
                list.add("(");
                list.add(str[i]);
            }
            if (i > num) {
                list2.add(")");
                list2.add(str[i]);
            }
        }
        String word = String.join("", list);
        String word2 = String.join("", list2);

        if (str.length % 2 == 0) {
            System.out.println(word + word2 + ")");
        }
        if (str.length % 2 == 1) {
            System.out.println(word + "(" + word2 + ")");
        }
    }
}