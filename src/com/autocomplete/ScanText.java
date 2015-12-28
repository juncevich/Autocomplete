package com.autocomplete;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

/**
 * Class, that scan file with text and parse it.
 */
public class ScanText {//NOPMD
    /**
     * List, with sorted words and numbers of repetitions.
     */
    private Map<String, String> dictionaryMap;
    /**
     * List, with test words.
     */
    private List<String> listWords;
    /**
     * Collection, that's used to sort output words
     * by amount of using.
     */
    private Map<String, String> tempTreeMap;


    /**
     * Method, that parse text file and put info to appropriate collections.
     *
     * @throws IOException This is exceptions.
     */
    public final void parseFile() throws IOException {
        dictionaryMap = new TreeMap<>();
        listWords = new ArrayList<>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream("resources\\test.in"), "Cp1251"));
        String str;


        final int numberOfEntriesInTheDictionary = Integer.valueOf(bufferedReader.readLine());
        for (int i = 0; i < numberOfEntriesInTheDictionary; i++) {
            str = bufferedReader.readLine();
            final String[] fields = str.split(" ");
            dictionaryMap.put(fields[0], fields[1]);
        }
        final int numberOfWords = Integer.valueOf(bufferedReader.readLine());
        for (int i = 0; i < numberOfWords; i++) {
            str = bufferedReader.readLine();
            listWords.add(str);
        }

    }

    /**
     * This method working with collections of information.
     * Correlates words with
     */
    public final void findMatches() {

        final long before = currentTimeMillis();
        for (final String word : listWords) {
            int count = 0;

            for (final Map.Entry<String, String> e : dictionaryMap.entrySet()) {


                if (e.getKey().startsWith(word)) {

                    out.println(e);
                    tempTreeMap.put(e.getKey(), e.getValue());
                    out.println(e.getKey() + " " + e.getValue());
                    count++;
                    if (e.getKey() == null) {
                        break;
                    }
                }
                if (count >= 10) {
                    break;
                }

            }

            out.println("--------------------------------------");
        }
        final long after = currentTimeMillis();
        out.println((after - before) / 1000 + "s.");
        @SuppressWarnings("unchecked")
        final List linkedList =
                new ArrayList<>(Sorter.SortByValue((TreeMap) tempTreeMap));
        for (int f = (linkedList.size() - 1);
             f > (linkedList.size() - 11); f--) {
            out.println(linkedList.get(f));
        }
        }

}

