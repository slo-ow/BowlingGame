package com.slow.bowling.main;

import java.util.Scanner;

public class BowlingGameMain {
    private BowlingGame g; //Singleton 객체 선언
    public void setUp(){ this.g = new BowlingGame(); } //Singleton 객체 생성 메소드
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BowlingGameMain main = new BowlingGameMain();
        main.setUp();
        while (true) {
            System.out.println("- Bowling Game -");
            System.out.println("[1] 게임시작");
            System.out.println("[2] 결과출력");
            System.out.println("[3] 규칙설명");
            System.out.println("[4] 게임종료");
            System.out.print("메뉴 선택 ?");
            int sw = scn.nextInt();
            switch (sw) {
                case 1:
                    System.out.println("입력 1");
                    main.g.startGame();
                    break;
                case 2:
                    System.out.println("입력 2");
                    break;
                case 3:
                    System.out.println("입력 3");
                    //규칙 설명서 출력
                    break;
                case 4:
                    System.out.println("입력 4");
                    System.out.println("볼링 게임을 종료 합니다.");
                    System.exit(0);
                default:
                    System.out.println("입력오류 / 처음부터 다시 입력하세요");
            }
        }
    }
}
