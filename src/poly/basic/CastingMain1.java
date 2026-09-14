package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();  // x001
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly; // x001 . poly는 Parent 타입이라 Child 타입의 child에 들어갈수없다. 하지만 자바야. 내가책임질께. 의미로 (Child) 라고한다. 그걸 다운캐스팅이라구
        poly.childMethod();
    }
}
