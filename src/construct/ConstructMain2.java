package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90); //생성자 호출. 객체를 생성해라 = 그 객체 이렇게 생성해라 란뜻
        MemberConstruct member2 = new MemberConstruct("user2",16); //오버로딩. 파라미터를 다르게 해서 다른생성자 또 만들수 있다.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
