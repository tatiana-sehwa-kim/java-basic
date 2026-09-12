package extends1.ex3;

public class Car {      // 부모 메서드

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    public void openDoor() {    // 부모에만 추가하면 자식에는 안써도 된다.
        System.out.println("문을 엽니다.");
    }

}
