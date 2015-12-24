package com.autocomplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;


/**
 * Класс для сортировки.
 */
public class Sorter {

    /**Сортирует TreeMap по значению.
     * @param treeMap сортируемый TreeMap.
     * @return отсортированный список по значениям.
     */
    public static List SortByValue(final TreeMap treeMap){
        final List entryList = new ArrayList(treeMap.entrySet());
        Collections.sort(entryList, new ValuesComparator());

        return entryList;
    }
}
