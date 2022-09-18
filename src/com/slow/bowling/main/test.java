package com.slow.bowling.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static String FILEPATH = "/Volumes/data/JSLProjects/BowlingGame/rule.dat";

    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream(FILEPATH);
             ObjectOutputStream oout = new ObjectOutputStream(out);
             InputStream in = new FileInputStream(FILEPATH);
             ObjectInputStream oin = new ObjectInputStream(in);){

            List<Rule> list = new ArrayList<>();

            Rule r1 = new Rule();
            list.add(r1);
            oout.writeObject(list);
            list = null;
            list = (List)oin.readObject();
            for(Rule r : list){
                r.displayInfo();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("파일 끝");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
