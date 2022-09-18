package com.slow.bowling.main;

import java.io.*;

public class Rule implements Serializable {
    public void displayInfo(){
        System.out.println("- BowlingGame -");
        System.out.println("[경기규칙]");
        System.out.println("* 1 게임은 모두 10개의 프레임(FRAME)으로 이루어져 있다.");
        System.out.println("* 1 프레임은 2회 까지 공을 던질 수 있다.");
        System.out.println("* 스트라이크(STRIKE) 10개의 볼링핀을 모두 쓰러트리는 경우");
        System.out.println("* 스페어(SPARE) 1회 공을 던지고 남아 있는 볼링핀을 2회에서 모두 제거 했을때");
    }
}




