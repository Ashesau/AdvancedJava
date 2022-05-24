/**
 * валидация строки на закрывающиеся скобки */

package AdvancedTasks;

import java.util.Scanner;

public class ClosingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобки (круглые, квадратные, фигурные): ");
        char[] str = scanner.nextLine().toCharArray();
        int brack = 0;
        int brack2 = 0;
        int brack3 = 0;

        boolean result = false;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                brack++;
            } else if (str[i] == ')') {
                brack--;
            }
            if (brack < 0) {
                result = true;
            }
            if (str[i] == '[') {
                brack2++;
            } else if (str[i] == ']') {
                brack2--;
            }
            if (brack2 < 0) {
                result = true;
            }
            if (str[i] == '{') {
                brack3++;
            } else if (str[i] == '}') {
                brack3--;
            }
            if (brack3 < 0) {
                result = true;
            }
        }
        if (result || (brack > 0) && result || (brack2 > 0) && result || (brack3 > 0)) {
            System.out.println("Not OK");
        } else {
            System.out.println("OK");
        }
    }
}