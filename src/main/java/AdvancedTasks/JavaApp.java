package AdvancedTasks;

import java.util.Scanner;

public class JavaApp {

    //Провалидировать строку на закрывающиеся скобки

    public static void main(String[] args) {

        String str;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        boolean result = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символ: ");
        str = sc.nextLine();
        sc.close();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(') {
                counter1++;
            }
            else if (str.charAt(i) == ')') {
                counter1--;
            }
            if(str.charAt(i) == '[') {
                counter2++;
            }
            else if (str.charAt(i) == ']') {
                counter2--;
            }
            if (str.charAt(i) == '{') {
                counter3++;
            }
            else if (str.charAt(i) == '}') {
                counter3--;
            }
        }

        if((counter1 == 0) && (counter2 == 0) && (counter3 == 0)) result = true;
        else result = false;

        System.out.println(result);
    }
}

