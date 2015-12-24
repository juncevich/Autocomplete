package com.autocomplete;


import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;

public class ScanText {
    static TreeMap<Object, Object> dictionaryMap;
    static TreeMap<Object, Object> tempTreeMap;
    static ArrayList<String> spisokSlov;






    public static void parseFile() throws IOException{
        dictionaryMap = new TreeMap();
        spisokSlov = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("resources\\test.in"), "Cp1251"));
        String str;


        int kolvoZapisSlovar = Integer.parseInt(br.readLine());
        for (Integer i = 0; i < kolvoZapisSlovar; i++) {
            str = br.readLine();
            String[] fields = str.split(" ");
            dictionaryMap.put(fields[0], fields[1]);
        }
        int kolvoSlov = Integer.parseInt(br.readLine());
        for (int i = 0; i < kolvoSlov; i++) {
            str = br.readLine();
            spisokSlov.add(str);
        }
    }

    public static void findMatches(){
        tempTreeMap = new TreeMap();
        for (String slovo:
             spisokSlov) {
            for (Map.Entry e : dictionaryMap.entrySet()){
                if (e.getKey().toString().startsWith(slovo)){
                    //System.out.println(e);
                    tempTreeMap.put(e.getKey(), e.getValue());
                    //System.out.println(e.getKey());
                }
            }

            }
//        List linkedList = new ArrayList(Sorter.SortByValue(tempTreeMap));
//        for(int f =(linkedList.size()-1); f>(linkedList.size()-11); f--){
//            System.out.println(linkedList.get(f));
//        }
        }

}

