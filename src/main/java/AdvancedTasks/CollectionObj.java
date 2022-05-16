package AdvancedTasks;

import java.util.Collection;
import java.util.HashSet;

public class CollectionObj {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}

// Метод, который на вход получает коллекцию объектов,
// а возвращает коллекцию уже без дубликатов.

