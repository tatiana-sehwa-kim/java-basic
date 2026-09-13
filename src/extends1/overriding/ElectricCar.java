package extends1.overriding;

public class ElectricCar extends Car {  // Car의 기능을 물려받는다.

    @Override       // 애노테이션: 프로그램이 읽을수있는 주석. 쓰는게좋다.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
