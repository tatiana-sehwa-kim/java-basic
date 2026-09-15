package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {    // 인스턴스면 변수선언을 해버릴수있음 그래서 한번에 해버리면됨. 다운캐스팅이랑 한꺼번에.
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
