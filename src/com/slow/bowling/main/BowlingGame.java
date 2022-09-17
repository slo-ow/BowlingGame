package com.slow.bowling.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BowlingGame {
    int[] rolls; //10프레임 게임동안 점수가 저장될 배열 선언

    int currentRoll; //프레임 값 증가

    public BowlingGame() { this.rolls = new int[21];} //생성자 호출과 동시에 점수가 저장될 배열 공간 생성, 최대 21 frame

    public void roll(int p) { rolls[currentRoll++] = p;} //프레임 0번쨰 부터 차례로 값을 추가함 최대 21 프레임까지

    private void socore(){
        int score = 0;
        int frame = 0;


    }
    public void startGame(){
        Scanner scn = new Scanner(System.in);
        List<String> tkList = new ArrayList<>(); // 토큰값을 한번 확인할 때 마다 토큰을 잃어버리기 때문에 저장해둘 공간 선언
        try {
            System.out.print("점수 등록 : ");
            String str = scn.nextLine();
            StringTokenizer st = new StringTokenizer(str, ", ");
            int count = st.countTokens();// 프레임수를 가져옴
            System.out.println("프레임 수 : " + count);
            while (st.hasMoreTokens()) { // 각 프레임에 담겨있는 값을 가져옴
                tkList.add(st.nextToken()); // 오류검사를 위해 리스트에 추가
            }
            for (int i = 0; i < tkList.size(); i++) {
                if (10 < Integer.parseInt(tkList.get(i))) { // 1프레임의 입력값이 10 보다 큰 값이 입력될 경우 에러 발생
                    throw new Exception("한 프레임당 최대 점수는 10점 입니다.");
                }
            }
            System.out.println("Clear"); // 여기까지 넘어오면 데이터에 문제는 없음, 값 출력해서 보여주면 됨
            System.out.println("- 사용자 점수 출력 -");
            for(String tk : tkList) {
                System.out.printf(tk+"\t");
            }
            System.out.println();
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(" 입력 오류 : " + e.getMessage());
        }
    }

}
