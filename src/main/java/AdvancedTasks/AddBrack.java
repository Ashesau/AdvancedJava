package AdvancedTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddBrack {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String w = s.nextLine();
        String[] str = w.split("");
        s.close();

        int num = str.length / 2;

        List list = new LinkedList();
        List list2 = new LinkedList();

        for (int i = 0; i < str.length; i++) {
            if ((str.length % 2 == 0) & i < num) {
                list.add(str[i]);
            }
            if ((str.length % 2 == 0) & i >= num) {
                list2.add(str[i]);
            }
            if ((str.length % 2 == 1) & i < num + 1) {
                list.add(str[i]);
            }
            if ((str.length % 2 == 1) & i >= num + 1) {
                list2.add(str[i]);
            }
        }

        String word = String.join("(", list);
        String word2 = String.join(")", list2);

        if (str.length % 2 == 0) {
            System.out.println("(" + word + "()" + word2 + ")");
        }
        if (str.length % 2 == 1) {
            System.out.println("(" + word + ")" + word2 + ")");
        }
    }
}
