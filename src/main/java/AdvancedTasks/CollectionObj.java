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

//    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>();
//
//        list.add("Cappuccino");
//        list.add("Espresso");
//        list.add("Latte");
//        list.add("Espresso");
//        list.add("Raff");
//        list.add("Raff");
//
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = list.size() - 1; j > i; j--) {
//                if (list.get(j).equals(list.get(i))) {
//                    list.remove(j);
//                }
//            }
//        }
//        System.out.println(list);
//    }