package poly.ex3;

public abstract class AbstractAnimal {  // 추상메서드가 하나라도 있으면 추상클래스

    public abstract void sound();   // 메서드 바디가 없다. 호출되면 안되겠쬬. 그리고 반드시 자식클래스가 오버라이딩 해야한다. 만약 오버라이딩 안하고 상속받으려면 걔도 추상클래스 여야한다.

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
