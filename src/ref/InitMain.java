package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); //초기화 하지 않은것. 0으로 프린트
        System.out.println("value2 = " + data.value2); //10으로 초기화 한것
    }
}
