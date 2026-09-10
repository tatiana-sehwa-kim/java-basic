package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

//★       instanceValue++; // 인스턴스 변수 접근, 컴파일에러 남
//        instanceMethod(); // 인스턴스 메서드 접근, 컴파일에러 남

        staticValue++; // 정적 변수 접근 : 같은 붕어빵틀에 있는거라 접근가능
        staticMethod(); // 정적 메서드 접근 : staticValue, staticCall, staticMethod 다 같은클래스에 있기때문에 가능
    }

    public void instanceCall() {  // 인스턴스 메서드
        instanceValue++; // ☆ 인스턴스 변수 접근 당연히 된다.
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근 ( Decodata. 이 생략된것 )
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}

// ★ 왜 오류가 나나? 인스턴스 변수는 인스턴스를 생성해야 알수있다. 그리고 그 참조값을 알아야 하는데 붕어빵 틀에서는 알수없다.
// 그래서 스태틱은 스태틱만 할수있는것

// ☆ 인스턴스 메서드는 인스턴스 메서드 실행하면 힙영역에 인스턴스생성. 메모리도 할당됨. 그래서 인스턴스변수 접근이 되는것