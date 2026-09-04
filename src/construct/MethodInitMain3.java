package construct;

public class MethodInitMain3 {
    public static void main(String[] args) { // 메서드로 반복 제거
        MemberInit member1 = new MemberInit();  //아무것도없는건 기본생성자. 생성자가 없으므로 자바가 기본생성자를 만들어준것이다.
        member1.initMember("user1",15,90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2",16,80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
