package construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    //추가. 2번에 맨마지막것이을 복붙했다. static 만 빼고
    void initMember(String name, int age, int grade) {

        // 이름이 똑같을 때는 this. 자기자신의 인스턴스를가리킴, name 파라미터가 있으므로 this를 써줘야함
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
