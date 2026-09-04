package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 이것이 생성자. 생성자는 클래스 이름이랑 똑같아야한다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ",age = " + age + ",grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 파라미터를 다르게 해서 다른 생성자도 만들수 있다. 이걸 "오버로딩"이라구.
    // this()는 생성자 코드의 첫줄에만 작성할 수 있다.

    MemberConstruct(String name, int age) {

        this(name, age, 50); // 변경. 이렇게 자기자신의 생성자를 또 호출.

//        this.name = name;
//        this.age = age;
//        this.grade = 50; //이름과 나이만 잇으면 성적은 50점이상으로시작한다 라고 할때.
    }
}
