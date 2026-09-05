package pack;

public class PackageMain1 {
    public static void main(String[] args) {

        Data data = new Data(); // 같은 패키지에 있는 경우 - 패키지 경로 생략 가능

        pack.a.User user = new pack.a.User(); // 다른패키지 경우 - 풀네임 - 너무 기니까 - import 사용하면된다.
    }
}
