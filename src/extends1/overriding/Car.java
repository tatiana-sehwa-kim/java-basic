package extends1.overriding;

public class Car {      // 부모 메서드

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    // public final void move() 라고 하면 오버라이드 못하게 막는것
    // private 으로 하면 오버라이드 못함. 다른클래스에서 못보기때문에

    public void openDoor() {    // 부모에만 추가하면 자식에는 안써도 된다.
        System.out.println("문을 엽니다.");
    }

}
