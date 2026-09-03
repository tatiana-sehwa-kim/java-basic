package oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;                       //속성

    void On() {
        isOn = true;                            //기능  속성과 기능이 하나로 뭉쳐있는것 : 객체 지향 프로그래밍
        System.out.println("음악 플레이어를 시작합니다.");                                      //변경도 훨쉽당
    }

    void Off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume ++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume --;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
