<<<<<<< HEAD
# Java Bowling Game
## [ Sample Code ]
=======
# JAVA_BowlingGame
***
## 🔍 [ Sample ]
>>>>>>> 67c029c16f60f80a4e01ba8b27d59f1da0b1f640
    ---------------------
        Bowling Game	
    ---------------------
    [1] 게임 시작
    [2] 게임 결과 출력
    [3] 게임 규칙 출력
    [4] 게임 규칙 다운로드
    [5] 게임 종료
        메뉴 선택 >> 
<<<<<<< HEAD
## [ Game Rule ]
=======
***
## 📝 [ 경기규칙 ]
>>>>>>> 67c029c16f60f80a4e01ba8b27d59f1da0b1f640
	1. 한 게임은 모두 10개의 프레임(FRAME)으로 이루어져 있다.
	2. 한 프레임은 2회 까지 공을 던질 수 있다.
	3. 스트라이크(STRIKE) 10개의 볼링핀을 모두 쓰러트리는 경우
	4. 스페어(SPARE) 1회 공을 던지고 남아 있는 볼링핀을 2회에서 모두 제거 했을때

<<<<<<< HEAD
## [ Game Rule Score ]
=======
***
## 📝 [ 볼링의 점수 계산 방법 ]
>>>>>>> 67c029c16f60f80a4e01ba8b27d59f1da0b1f640
	볼링핀이 1개 쓰러질 때 마다 +1 점
	스페어일 경우 ( 그 다음 프레임에서 1 회차의 점수를 더한다.)
	예를들어 1 프레임 1회 8핀, 2회 스페어(2핀 처리했음) 일 경우 10점을 뭍고
	2프레임 1회 7핀을 쳤을 경우 1 프레임의 점수는 10 + 7 = 17점이 된다.

    스트라이크일 경우 (해당 프레임은 10점을 가져오고 다음 프레임으로 넘어간다.)
	예를들어 1 프레임 1회 스트라이크 10핀 처리일 경우 1 프레임 점수는 10점
	그 다음 2 프레임에서 1회 7핀, 2회 2핀 = 9핀 일 경우 1 프레임의 점수는 10 + 9 = 19점이 된다.
	연속 스트라이크일 경우 1 프레임 + 2 프레임 + 3 프레임 = 30점
	마지막 10 프레임의 경우, 스페어 처리를 하거나 스트라이크를 치게 되면 10 프레임 경기에서 최대 3 회 까지
    공을 던질 수 있지만 10 프레임 경기에서 스트라이크를 쳤다고 해서 앞선 프레임 처럼 보너스 점수를 얻을 순 없다.
    단지 쓰러트린 핀 수 만큼 점수를 얻을 수 있다.

<<<<<<< HEAD
### Folder structural diagram
<img src="/Volumes/data/jsl-projects/BowlingGame/img/diagram.png" width="500" height="450">

### Class Diagram
<img src="/Volumes/data/jsl-projects/BowlingGame/img/class-diagram.png" width="500" height="450">

### BowlingGame FlowChart - 1
<img src="/Volumes/data/jsl-projects/BowlingGame/img/flow1.png" width="500" height="450">

### BowlingGame FlowChart - 2
<img src="/Volumes/data/jsl-projects/BowlingGame/img/flow2.png" width="500" height="450">

### BowlingGame FlowChart - 3
<img src="/Volumes/data/jsl-projects/BowlingGame/img/flow3.png" width="500" height="450">

### Reference to open license
    https://gist.github.com/felipernb/3981562
=======
### 📌 BowlingGame.java 오픈소스 참고 주소
    https://gist.github.com/felipernb/3981562
>>>>>>> 67c029c16f60f80a4e01ba8b27d59f1da0b1f640
