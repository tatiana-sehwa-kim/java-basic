package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
//        super(); // 기본 생성자 생략 가능
        this(a, 0);
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
//        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + ",b=" + b);
    }
}

// 생성자를 하나라도 정의해버리면 기본 생성자를 만들어주지 않는다. 그래서 ClassC에서 super();를 직접 해줘야한다.
