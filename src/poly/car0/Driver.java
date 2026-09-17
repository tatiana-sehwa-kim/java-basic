package poly.car0;

public class Driver {

    private K3Car k3Car;        // 초기화로 null 값
    private Model3Car model3Car; //추가해야 한다.     // 클래스 의존관계; 이 드라이버는 K3와 model3에 의존한다. 라고한다. 알고있다는뜻

    public void setK3Car(K3Car k3Car) {     // 이걸 호출하는 순간 Driver 안의 k3Car 변수에 실제 K3Car 객체의 메모리 주소가 쏙 들어갑니다.
        this.k3Car = k3Car;
    }

    // 추가
    public void setModel3Car(Model3Car model3Car) {     // 추가해야 한다. 단축키 "set"
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }

}
