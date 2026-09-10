package static2;

public class DecoUtil2 {

    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}

// 메서드 앞에 static이 붙어있다. -> 정적 메서드가 되는것. 인스턴스 없이 클래스명으로 바로 호출 가능