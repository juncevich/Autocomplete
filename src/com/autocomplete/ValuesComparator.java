package com.autocomplete;


import java.util.Comparator;
import java.util.Map;

/**
 * Класс, который сортирует Map по значениям.
 */
public class ValuesComparator implements Comparator {//NOPMD

    /**
     * Compare values.
     *
     * @param o1 first value.
     * @param o2 second value.
     * @return result of the comparison.
     */
    @Override
    public final int compare(final Object o1, final Object o2) {
        final Map.Entry e1 = (Map.Entry) o1;
        final Map.Entry e2 = (Map.Entry) o2;
        final Comparable c1 = (Comparable) e1.getValue();
        final Comparable c2 = (Comparable) e2.getValue();
        return c1.compareTo(c2);
    }
}
