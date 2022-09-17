package com.slow.bowling.main;

import java.util.*;

public class BowlingGame {
    int[] rolls; // 10프레임 게임동안 점수가 저장될 배열 선언

    int currentRoll; // 프레임 값 증가

    List<String> tkList = new ArrayList<>(); // 토큰값은 한번 확인할 때 마다 토큰을 쓰고 버리기 때문에 값을 저장해둘 List 선언

    public BowlingGame() { this.rolls = new int[21];} // 생성자 호출과 동시에 점수가 저장될 배열 공간 생성, 최대 21 frame

    private void rollMany(int count, List<String> tklist){ // 사용자 점수를 int형 배열에 담아주는 메소드
        for (int i=0; i < count; i++) {
            roll(Integer.parseInt(tklist.get(i)));
        }
    }
    private void roll(int p) { rolls[currentRoll++] = p;} // 프레임 0번쨰 부터 차례로 값을 추가함 최대 21 프레임까지

    public int score(){ // 점수의 합을 구하는 메소드
        int score = 0;
        int frame = 0;
        for (int i = 0; i < 10; i++) {
            if (isStrike(frame)) {
                score += 10 + strikeBonus(frame);
                frame++;
            } else if (isSpare(frame)) {
                score += 10 + spareBonus(frame);
                frame += 2;
            } else {
                score += sumOfRolls(frame);
                frame += 2;
            }
        }
        return score;
    }
    private boolean isStrike(int frame) {return rolls[frame] == 10;}

    private boolean isSpare(int frame) {return sumOfRolls(frame) == 10;}

    private int strikeBonus(int frame) {return sumOfRolls(frame+1);}

    private int spareBonus(int frame) {return rolls[frame+2];}

    private int sumOfRolls(int frame) {return rolls[frame] + rolls[frame+1];}
    public void printScore(){
        System.out.println("---------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\t게임 점수 출력\t\t\t\t\t\t|");
        System.out.println("---------------------------------------------------------");
//        System.out.println("| 1회 | 2회 | 3회 | 4회 | 5회 | 6회 | 7회 | 8회 | 9회 | 10회 |");
        for(int i=0; i<currentRoll; i++) System.out.printf(rolls[i]+"|");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("| 총점 : " + score() + "\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println();
    }

    public void startGame() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("점수 등록 : ");
            String str = scn.nextLine();
            StringTokenizer st = new StringTokenizer(str, ", ");
//            System.out.println("st length : " + st.nextToken().length());
            int count = st.countTokens();// 프레임 갯수를 가져옴
//            System.out.println("프레임 수 : " + count);
            if(count == 0) { // 공백을 입력할 시 게임을 진행조차 하지 않았기 때문에 리턴시킴
                System.out.println("최소한 1 프레임 이상은 진행해야만 합니다.");
                return;
            }
            while (st.hasMoreTokens()) { // 각 프레임에 담겨있는 값을 가져옴
                tkList.add(st.nextToken()); // 오류검사를 위해 리스트에 추가
            }
            for (int i = 0; i < tkList.size(); i++) {
                if (10 < Integer.parseInt(tkList.get(i))) { // 1프레임의 입력값이 10 보다 큰 값이 입력될 경우 에러 발생
                    throw new InputMismatchException("한 프레임당 최대 점수는 10점 입니다.");
                }
            }
//            System.out.println("Clear"); // 여기까지 넘어오면 데이터에 문제는 없음, 사용자 점수 계산 시작
            rollMany(count, tkList); // 프레임 갯수와 프레임에 담겨있는 값들을 전달
            scn = null; // 스캐너 초기화
        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("입력 오류 : " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("점수 이외의 값은 입력하실 수 없습니다.");
        }
    }

}
