package final1;

public class FieldInit {

    public static final int CONST_VALUE = 10; // 관례: static final이 붙으면 대문자 변수를 쓴다 -> 바뀌지 않는 공용 변수
    final int value = 10;

//    public FieldInit(int value) {
//         this.value = value;     // 초기값이 있는경우 안됨
//    }
}
