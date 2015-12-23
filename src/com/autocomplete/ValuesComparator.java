package com.autocomplete;


import java.util.Comparator;
import java.util.Map;

/**
 * Класс, который сортирует Map по значениям.
 */
public class ValuesComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry e1 = (Map.Entry) o1;
        Map.Entry e2 = (Map.Entry) o2;
        Comparable c1 = (Comparable) e1.getValue();
        Comparable c2 = (Comparable) e2.getValue();
        return c1.compareTo(c2);
    }
}
