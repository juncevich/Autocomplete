package com.autocomplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


/**
 * Класс для сортировки.
 */
public abstract class Sorter {

    /**Сортирует TreeMap по значению.
     * @param treeMap сортируемый TreeMap.
     * @return отсортированный список по значениям.
     */
    public static List sortByValue(final Map treeMap) {
        final List entryList = new ArrayList(treeMap.entrySet());
        Collections.sort(entryList, new ValuesComparator());

        return entryList;
    }
}
