package final1.ex;

public class Member {

    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
//        this.id = id;       // final 이므로 바꿀수 없음. 컴파일 오류
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + ", name: " + name);
    }
}

// final
