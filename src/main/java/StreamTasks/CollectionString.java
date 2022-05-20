/**
 * Дана коллекция строк List.of(«a1», «a4», «a3», «a2», «a1», «a4»)
 * Отсортировать коллекцию строк по алфавиту
 * Добавить "_1" к каждому элементу
 * В коллекции убрать первый символ и вернуть массив чисел (int[])
 * Отсортировать коллекцию строк по алфавиту и убрать дубликаты */

package StreamTasks;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionString {
    public static void main(String[] args) {

        Collection<String> collection = List.of ("a1", "a4", "a3", "a2", "a1", "a4");
        List<String> transform = collection.stream().map((s) -> s + "_1").collect(Collectors.toList());
        System.out.println("Добавление \"_1\" к каждому элементу - " + transform);

        List<Integer> number = collection.stream().map((s) -> Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println("Убрать первый символ и возвратить массив чисел - " + number);

        List<String> sorted = collection.stream().sorted().collect(Collectors.toList());
        System.out.println("Сортировка по алфавиту - " + sorted);

        List<String> sortedDistinct = collection.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("Убраны дубликаты и сортировка по алфавиту - " + sortedDistinct);
    }
}