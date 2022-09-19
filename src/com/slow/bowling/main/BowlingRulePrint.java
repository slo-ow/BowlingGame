package com.slow.bowling.main;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
public class BowlingRulePrint {
    public String FILEPATH = System.getProperty("user.dir") + File.separator; //절대경로
    public String FILENAME;
    List<Rule> list = new ArrayList<>();
    public static ObjectInputStream oin;
    public static ObjectOutputStream oos;
    void printRule() throws Exception{
        FILENAME = "rule.dat";
        oin = new ObjectInputStream(
                new BufferedInputStream(
                        Files.newInputStream(new File(FILEPATH+FILENAME).toPath())));
        oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        Files.newOutputStream(new File(FILEPATH+FILENAME).toPath())));
        Rule r1 = new Rule();
        list.add(r1);
        oos.writeObject(list);
        list = null; // list 비우기
        list = (List)oin.readObject();
        for(Rule r : list){r.displayInfo();}
            oos.close();
            oin.close();
    }

    void downloadRule() throws Exception{
        String FOLDER = "/download";
        System.out.println(FILEPATH);
        File f = new File(FILEPATH+FOLDER);
//         폴더 생성 : mkdir()
        if(!f.exists()){ // 폴더가 존재하는지 체크, 없다면 생성
            if(f.mkdir())
                System.out.println("폴더 생성 성공");
            else
                System.out.println("폴더 생성 실패");
        } else { // 폴더가 존재한다면
            System.out.println("폴더가 이미 존재합니다.");
        }
        System.out.println();

        FILENAME = "rule.txt";
        // 파일 생성 : createNewFile()
        File f2 = new File(f, FILENAME);	// File(디렉터리 객체, 파일명)
        System.out.println(f2.getAbsolutePath());
        if (!f2.exists()) {	// 파일이 존재하지 않으면 생성
            try {
                if (f2.createNewFile()) {
                    System.out.println("파일 생성 성공");
                    StringBuilder stringBuilder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new FileReader(FILEPATH+FILENAME));
                    String s;
                    while((s = br.readLine()) != null){
                        stringBuilder.append(s).append("\n");
                    }
//                    System.out.println(stringBuilder);
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
                    bw.write(String.valueOf(stringBuilder));
                    br.close();
                    bw.close();
                }
                else {
                    System.out.println("파일 생성 실패");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {	// 파일이 존재한다면
            System.out.println("파일이 이미 존재합니다.");
        }
        System.out.println();
    }

    private void rw_Rule(){

    }
}
