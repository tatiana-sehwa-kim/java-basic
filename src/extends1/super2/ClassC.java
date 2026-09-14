package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        // super(); 자동으로 안만들어 주기 때문에 필요하면 직접 생성
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}

//ClassA는 매개변수가 없는 기본 생성자 ClassA()가 존재하므로, 컴파일러가 super();를 대신 넣어줄 수 있었습니다.

//반면 ClassB는 개발자가 ClassB(int a), ClassB(int a, int b)만 만들어두어 기본 생성자(ClassB()) 자체가 세상에 없습니다.

//만약 ClassC에서 super(10, 20)을 안 적으면 컴파일러가 super();를 넣으려고 시도하는데, ClassB에는 기본 생성자가 없으니 컴파일 에러(빨간 줄)가 발생합니다.
// 그래서 ClassC에서는 직접 super(10, 20)이라고 명시해야만 했던 것입니다.
