package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = child; // 가능. 부모는 자식을 담을수 있음. 원래는 (Parent) child; 해야하나, 업캐스팅은 생략 가능. 생략 권장
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();

    }
}