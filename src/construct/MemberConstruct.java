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
}
