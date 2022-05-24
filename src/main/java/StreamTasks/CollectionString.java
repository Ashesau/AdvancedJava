/**
 * Дана коллекция строк List.of(«a1», «a4», «a3», «a2», «a1», «a4»)
 * Отсортировать коллекцию строк по алфавиту
 * Добавить "_1" к каждому элементу
 * В коллекции убрать первый символ и вернуть массив чисел (int[])
 * Отсортировать коллекцию строк по алфавиту и убрать дубликаты */

package StreamTasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionString {
    static Collection<String> collection = List.of("a1", "a4", "a3", "a2", "a1", "a4");

    public static void alphabetically() {
        System.out.println("Сортировка по алфавиту");
        List<String> sorted = CollectionString.collection.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("count = " + sorted);
    }
    public static void elementAdd1() {
        System.out.println("add1");
        List<String> transform = CollectionString.collection.stream()
                .map((s) -> s + "_1")
                .collect(Collectors.toList());
        System.out.println("countAdd = " + transform);
    }
    public static void integerRemove() {
        System.out.println("rmv 'a' -> int Убрать первый символ и Возвратить массив чисел");
        int[] number = CollectionString.collection.stream()
                .mapToInt((s) -> Integer.parseInt(s.substring(1)))
                .toArray();
        System.out.println("countRemove = " + Arrays.toString(number));
    }
    public static void sortDouble() {
        System.out.println("Уникальность и сортировка по алфавиту");
        List<String> sortedDistinct = CollectionString.collection.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("countSort = " + sortedDistinct);
    }
}


//        List<Integer> number = collection.stream()
//        .map((s) -> Integer.parseInt(s.substring(1)))
//        .collect(Collectors.toList());
//        System.out.println("Убрать первый символ и возвратить массив чисел - " + number);

