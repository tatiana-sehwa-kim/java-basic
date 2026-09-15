package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;     //하면 들어가는짐. 업캐스팅
        child1.childMethod();               // 문제 없음

        Parent parent2 = new Parent();
//        Child child2 = parent2;         // 실행시 오류. 이 parent를 child에 담을수 없어. 하고 오류를. -> 런타임 오류 ClassCastException
//        child2.childMethod();           // 그다음 코드 실행은 불가

        // 둘째문단 메모리 실제 상황: new Parent()로 만들었습니다.
        // 세상에 태어날 때 오직 [ Parent 기능 ] 딱 하나만 메모리에 생성되었습니다.
        // Child라는 영역 자체가 메모리에 아예 존재하지 않습니다.
    }
}
