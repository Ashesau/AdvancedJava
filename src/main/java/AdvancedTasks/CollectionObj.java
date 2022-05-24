/**
 * Метод, который на вход получает коллекцию объектов,
а возвращает коллекцию уже без дубликатов */

package AdvancedTasks;

import java.util.HashSet;

public class CollectionObj {
    public static void main(String[] args) {

        HashSet<String> coffee = new HashSet<>();
        coffee.add("Cappuccino");
        coffee.add("Espresso");
        coffee.add("Latte");
        coffee.add("Espresso");
        coffee.add("Raff");
        coffee.add("Raff");

        for (String str : coffee) {
            System.out.println(str);
        }
    }
}