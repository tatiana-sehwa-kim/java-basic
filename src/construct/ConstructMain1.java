package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90); //생성자 호출. 객체를 생성해라 = 그 객체 이렇게 생성해라 란뜻
        MemberConstruct member2 = new MemberConstruct("user2",16,80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
