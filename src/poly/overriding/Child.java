package poly.overriding;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");    // 자식 메서드 재정의 해씀
    }
}
