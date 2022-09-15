import org.junit.*;
public class BowlingGameTest {
    private BowlingGame g; //Singleton

    @Before // 각각의 테스트가 실행되기 전에 초기화 되는 메소드를 의미함
    public void setUp(){ this.g = new BowlingGame();} //Singleton 객체 생성 메소드

    @Test //단위 테스트를 진행할 메소드에 선언함
    public void Test(){
        System.out.println("Test");
    }
}
