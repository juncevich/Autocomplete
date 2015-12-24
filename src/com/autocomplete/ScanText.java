package com.autocomplete;


import java.io.*;
import java.util.*;

public class ScanText {
    static TreeMap<Object, Object> treeMap;
    static TreeMap<Object, Object> tempTreeMap;
    public static void scan() throws IOException{
//        try {
//
//            Scanner scan=new Scanner(new FileInputStream("D:\\IdeaProjects\\Autocomplete\\resources\\test.in"));
//            while (scan.hasNextLine()) {
//                String s=scan.nextLine();
//                System.out.println(s);
//            }
//         scan.close();
//     } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
        String h=bread.readLine();
        treeMap = new TreeMap();
        tempTreeMap = new TreeMap();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("resources\\test.in"), "Cp1251"));
        String str;

        int i = 0;
        Integer j = Integer.parseInt(br.readLine());
        for (int ii = 0; ii< j; ii++) {
            str = br.readLine();
            String[] fields = str.split(" ");
            treeMap.put(fields[0], fields[1]);
        }
        for (Map.Entry e : treeMap.entrySet()){
            if (e.getKey().toString().startsWith(h)){
                //System.out.println(e);
                tempTreeMap.put(e.getKey(), e.getValue());
            }
        }
        List linkedList = new ArrayList(Sorter.SortByValue(tempTreeMap));
        for(int f =(linkedList.size()-1); f>(linkedList.size()-11); f--){
            System.out.println(linkedList.get(f));
        }

        br.close();

    }


}

