package AdvancedTasks;

import java.util.Scanner;

public class RepeatingChar {                //Найти первый наиболее часто повторяющийся в строке символ

    public static void main(String[] args) {

        String str = "aabcccccaaa";
        System.out.println ("Исходный символ: " + str);

        Scanner sc = new Scanner(System.in);
        System.out.print ("Введите символ, который хотите найти:\n");
        char ch = sc.next (). charAt (0);
        sc.close();
        int i, sum = 0;

        for ( i = 0 ; i < str.length() ; i++) {

            if ( str.charAt(i) == ch )
                ++ sum;
        }
        System.out.print ("Символ " + ch + " появляется в строке " + sum + " раз\n");
    }

//    public String compressBad(String str) {    /* строка aabcccccaaa должна превратиться в а2b1с5аЗ.
//                                                 Если «сжатая» строка оказывается длиннее исходной,
//                                                 метод должен вернуть исходную строку */
//
//        String myStr = "";
//        char last = str.charAt(0);
//        int count = 1;
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i) == last) { // Находим повторяющийся символ
//                count++;
//            } else {  // Вставляем счетчик символа и обновляем последний символ
//                myStr += last + count;
//                last = str.charAt(i);
//                count = 1;
//            }
//        }
//        return myStr + last + count;
//    }

//    String compressAlternate(String str) {
//        /* Проверяем, вдруг сжатие создаст более длинную строку */
//        int size = countCompression(str);
//        if (size >= str.length()) {
//            return str;
//        }
//
//        char[] array = new char[size];
//        int index = 0;
//        char last = str.charAt(0);
//        int count = 1;
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i) == last) { // Найдите повторяющийся символ
//                count++;
//            }  else {
//                /* Обоновляем счетчик повторяющихся символов */
//                index = setChar(str, array, last, index, count);
//                last = str.charAt(i);
//                count = 1;
//            }
//        }
//
//        /* Обновляем строку с последним набором повторяющихся символов */
//        index = setChar(str, array, last, index, count);
//        return String.valueOf(array);
//    }
//
//    int setChar(String str, char[] array, char c, int index,
//                int count) {
//        array[index] = c;
//        index++;
//
//        /* Конвертируем счетчик в строку */
//        char[] cnt = String. valueOf (count) .toCharArray();
//
//        /* Копируем символы от большего разряда к меньшему */
//        for (char х : cnt) {
//            array[index] = х;
//            index++;
//        }
//        return index;
//    }
//
//    int countCompression(String str) {
//        /* так же, как и раньше  */
//    }
}
