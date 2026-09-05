package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {

        User userA = new User();  //pack.a.User를 이미 임포트 해왔기 때문에 b는 풀로 써줘야한다.

        pack.b.User userB = new pack.b.User(); //풀로 써주기. 자주 사용하는 애를 임포트하고 자주 사용 안하는애를 이렇게 씀
    }
}
