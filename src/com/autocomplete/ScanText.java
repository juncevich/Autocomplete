package com.autocomplete;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ScanText {
    TreeMap dictionaryMap;
    ArrayList<String> listWords;






    public void parseFile() throws IOException{
        dictionaryMap = new TreeMap();
        listWords = new ArrayList<>(1000000);
        final BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("resources\\test.in"), "Cp1251"));
        String str;


        final int kolvoZapisSlovar = Integer.valueOf(br.readLine());
        for (int i = 0; i < kolvoZapisSlovar; i++) {
            str = br.readLine();
            final String[] fields = str.split(" ");
            dictionaryMap.put(fields[0], fields[1]);
        }
        final int kolvoSlov = Integer.valueOf(br.readLine());
        for (int i = 0; i < kolvoSlov; i++) {
            str = br.readLine();
            listWords.add(str);
        }
        System.out.println(dictionaryMap.lastKey());
    }

    public void findMatches() {

        long before = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : listWords) {
            int count = 0;

            for (final Map.Entry<String, String> e : dictionaryMap.entrySet()) {


                if (e.getKey().startsWith(word)) {

                    //System.out.println(e);
                    //tempTreeMap.put(e.getKey(), e.getValue());
                    //System.out.println(listWords.get(i) + " " + e.getKey() + " " + e.getValue());
                    //stringBuilder.append(e.getKey()).append("\n").toString();
                    //System.out.println(stringBuilder);
                    count++;
                    if (e.getKey() == null) break;


                }
                if (count >= 10) break;

            }

            System.out.println("--------------------------------------");
        }
        long after = System.currentTimeMillis();
        System.out.println((after - before)/1000 + "s.");
//            List linkedList = new ArrayList(Sorter.SortByValue(tempTreeMap));
//            for (int f = (linkedList.size() - 1); f > (linkedList.size() - 11); f--) {
//                System.out.println(linkedList.get(f));
//            }
        }


//    public void findMatchesWithSubMap() {
//        //tempTreeMap = new TreeMap();
//
//        for (int i=0;i< listWords.size();i++) {
//            int count = 0;
//
//            for (final Map.Entry e : dictionaryMap.entrySet()) {
//
//
//                if (e.getKey().toString().startsWith(listWords.get(i))){
//
//                    //System.out.println(e);
//                    //tempTreeMap.put(e.getKey(), e.getValue());
//                    System.out.println(listWords.get(i) + " " + e.getKey() + " " + e.getValue());
//                    count++;
//                    if (e.getKey()==null) break;
//
//                }
//                if (count >= 10) break;
//
//            }
//            //System.out.println("--------------------------------------");
//        }
////            List linkedList = new ArrayList(Sorter.SortByValue(tempTreeMap));
////            for (int f = (linkedList.size() - 1); f > (linkedList.size() - 11); f--) {
////                System.out.println(linkedList.get(f));
////            }
//    }

}

