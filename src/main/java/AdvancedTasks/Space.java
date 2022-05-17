/* Дана строка, Вам требуется преобразовать
все идущие подряд пробелы в один.*/
package AdvancedTasks;

public class Space {

    public static void main(String[] args) {
        String s = " Omae wa     mo         shindeiru  ";
        System.out.println(s.replaceAll("( +)"," ").trim());
    }
}


