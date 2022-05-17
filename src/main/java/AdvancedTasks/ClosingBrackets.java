/* валидация строки на закрывающиеся скобки */
package AdvancedTasks;

import java.util.Scanner;

public class ClosingBrackets {
    public static void main(String[] args) {

        String str;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        boolean result = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите символ:\n");
        str = scan.nextLine();
        scan.close();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(') {
                count1++;
            }
            else if (str.charAt(i) == ')') {
                count1--;
            }
            if(str.charAt(i) == '[') {
                count2++;
            }
            else if (str.charAt(i) == ']') {
                count2--;
            }
            if (str.charAt(i) == '{') {
                count3++;
            }
            else if (str.charAt(i) == '}') {
                count3--;
            }
        }

        if((count1 == 0) && (count2 == 0) && (count3 == 0)) {
            result = true;
            System.out.println("OK");
        } else result = false;
        System.out.println("Not OK");
    }
}

