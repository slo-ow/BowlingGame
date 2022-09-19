package com.slow.bowling.main;

import java.io.*;
import java.util.ArrayList;
public class test {
    public static String FILEPATH = "/Volumes/data/JSLProjects/BowlingGame/download/rule.txt";
    public static String FILEPATH2 = "/Volumes/data/JSLProjects/BowlingGame/rule.txt";

    public static void main(String[] args) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(FILEPATH2));
        String s;
        while((s = br.readLine()) != null){
            stringBuilder.append(s).append("\n");
        }
//        System.out.println(stringBuilder);

        BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH));
        bw.write(String.valueOf(stringBuilder));
        br.close();
        bw.close();
    }
}
