/**
 *  Дана строка, Вам требуется преобразовать
все идущие подряд пробелы в один */

package AdvancedTasks;

import java.util.Scanner;

public class Space {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите что-нибудь интересное:");

        String s = scan.nextLine();
        System.out.println(s.replaceAll("( +)"," ").trim());
    }
}