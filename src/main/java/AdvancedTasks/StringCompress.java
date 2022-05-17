/* Реализовать метод сжатия строки на основе
счетчика повторяющихся символов.
Например, строка "aabcccccaaa" должна превратиться в "а2b1с5аЗ".
Если «сжатая» строка оказывается длиннее исходной, метод должен
вернуть исходную строку */
package AdvancedTasks;

public class StringCompress {

    public static String compress(String str) {
        int size = countCompression(str);
        if (size >= str.length()) {
            return str;
        }
        StringBuffer new_str = new StringBuffer();
        char sym = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == sym) {
                count++;
            } else {
                new_str.append(sym);
                new_str.append(count);
                sym = str.charAt(i);
                count = 1;
            }
        }
        new_str.append(sym);
        new_str.append(count);
        return new_str.toString();
    }

    static int countCompression(String str) {
        char sym = str.charAt(0);
        int size = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == sym) {
                count++;
            } else {
                sym = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 0;
            }
        }
        size += 1 + String.valueOf(count).length();
        return size;
    }

    public static void main(String[] args) {
        String str = "qqqqqwwwwwwee";
        System.out.println(compress(str));
    }
}
