package pack;

import pack.a.*;

//import pack.a.User;     // 같은 패키지 여러개 갖다 쓴다고 하면 이렇게 늘어쓰지말고
//import pack.a.User2;    // import.pack.a.*; 별을써주면 된다.

public class PackageMain2 {
    public static void main(String[] args) {

        Data data = new Data(); // 같은 패키지에 있는 경우 - 패키지 경로 생략 가능

        User user = new User(); // import를 써서 다른 패키지에 있는 클래스를 가져와 쓴다.

        User2 user2 = new User2();
    }
}
