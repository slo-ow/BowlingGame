package com.slow.bowling.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BowlingGameMain {
    private BowlingGame g; //Singleton 객체 선언
    private BowlingRulePrint p;
    public void setUp(){ this.g = new BowlingGame(); } //Singleton 객체 생성 메소드
    public void setUpPrint(){this.p = new BowlingRulePrint();}
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        BowlingGameMain main = new BowlingGameMain();
        while (true) {
            try {
                System.out.println("---------------------");
                System.out.println("\tBowling Game\t");
                System.out.println("---------------------");
                System.out.println("[1] 게임 시작");
                System.out.println("[2] 게임 결과 출력");
                System.out.println("[3] 게임 규칙 출력");
                System.out.println("[4] 게임 규칙 다운로드");
                System.out.println("[5] 게임 종료");
                System.out.print("    메뉴 선택 >> ");
                int sw = scn.nextInt();
                if(sw <= 5) {
                    switch (sw) {
                        case 1:
                            main.setUp();
                            main.g.startGame();
                            break;
                        case 2:
                            //게임결과 출력
                            main.g.printScore();
                            break;
                        case 3:
                            //규칙 설명서 txt 읽기
                            main.setUpPrint();
                            main.p.printRule();
                            break;
                        case 4:
                            //규칙 설명서 txt 다운로드
                            main.setUpPrint();
                            main.p.downloadRule();
                            break;
                        case 5:
                            System.out.println("볼링 게임을 종료 합니다.");
                            System.exit(0);
                        default:
                            System.out.println("입력 오류 : 메뉴를 다시 입력하세요");
                    }
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("입력 오류 : 메뉴 이외의 값은 입력하실 수 없습니다.");
                System.out.println("프로그램을 다시 실행 하세요.");
                break;
            } catch (NullPointerException e){
                System.out.println("출력 오류 : 게임을 먼저 시작해 주세요.");
                System.out.println("프로그램을 다시 실행 하세요.");
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("에러 발생");
                System.out.println("Main Exception : " + e.getMessage());
                break;
            }
        }
    }
}
