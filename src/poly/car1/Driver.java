package poly.car1;

public class Driver {

    private Car car;    // 운전자는 자동차 기종 말고 그냥 자동차만 암. 멤버변수로 Car 만 가진다!!

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
