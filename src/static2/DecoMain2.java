package static2;

public class DecoMain2 {
    public static void main(String[] args) {

        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}

// 아주 단순한 기능(별 붙이기)을 위해 객체 생성을 하고 메서드를 불러오는 번거로운 과정 -> static 메서드를 사용하지 않았을때.
