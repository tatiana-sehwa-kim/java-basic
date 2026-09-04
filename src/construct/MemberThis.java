package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;  // 멤버변수에 nameField를 찾을수 있으므로 this. 가 생략됨 우리눈에만생략된거임.
    }
}
