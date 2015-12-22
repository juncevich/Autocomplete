package com.autocomplete;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class ScanText {
    static TreeMap<Object, Object> treeMap;
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
        treeMap = new TreeMap();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("D:\\IdeaProjects\\Autocomplete\\resources\\test.in"), "Cp1251"));
        String str;

        int i = 0;
        Integer j = Integer.parseInt(br.readLine());
        for (int ii = 0; ii< j; ii++) {
            str = br.readLine();
            String[] fields = str.split(" ");
            treeMap.put(fields[0], fields[1]);
        }

        System.out.println(treeMap.size());
        //System.out.println(treeMap.entrySet());
        br.close();

    }
}

