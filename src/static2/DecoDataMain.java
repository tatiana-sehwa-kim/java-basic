package static2;

// import static static2.DecoData.staticCall; 메서드를 지정하고싶다면 이르케
import static static2.DecoData.*;            // 저 클래스의 메서드 다쓰고 싶으면 이르케

public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1. 정적 호출");
        DecoData.staticCall();                       // alt + enter 로 import 띄우고 DecoData. 을 생략
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 여기서부턴 static 메서드 3

        // 인스턴스를 통한 접근 : 비권장. 노란줄뜨자나. 인스턴스 메서드 같자나.
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근 : 보자마자 아 이거 스태틱이네. 라고 알수있음.
        staticCall();
    }
}
